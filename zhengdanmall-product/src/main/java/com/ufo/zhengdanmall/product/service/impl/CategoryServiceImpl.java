package com.ufo.zhengdanmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ufo.common.utils.PageUtils;
import com.ufo.common.utils.Query;

import com.ufo.zhengdanmall.product.dao.CategoryDao;
import com.ufo.zhengdanmall.product.entity.CategoryEntity;
import com.ufo.zhengdanmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 生成菜单树
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        //1、查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        //2、组装父子树形结构
        //2.1 找到所有一级分类
        List<CategoryEntity> MenusTree = categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                //过滤完后就找到了所有的一级菜单，进行映射，给一级菜单映射子菜单
                .map(menu->{
                    menu.setChildren(getChildrens(menu,categoryEntities));
                    return menu;
                })
                //进行排序
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() ==null ? 0:menu1.getSort()) -
                            (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());

        return MenusTree;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 业务：检查当前的菜单是否被别的地方所引用
        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {
        List<Long> paths = new ArrayList<>();
        findParentPath(catelogId,paths);
        Collections.reverse(paths);
        return paths.toArray(new Long[paths.size()]);
    }

    /**
     * 获取父节点的catelogId
     * @param catelogId
     * @param paths
     */
    private void findParentPath(Long catelogId, List<Long> paths) {
        //收集当前节点id
        paths.add(catelogId);
        CategoryEntity byId = this.getById(catelogId);
        if (byId.getParentCid()!=0){
            findParentPath(byId.getParentCid(),paths);
        }
    }


    //递归查找所有菜单的子菜单
    public List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> categoryEntities){

        List<CategoryEntity> childrens = categoryEntities.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildrens(categoryEntity, categoryEntities));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() ==null ? 0:menu1.getSort())- (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return childrens;
    }

}