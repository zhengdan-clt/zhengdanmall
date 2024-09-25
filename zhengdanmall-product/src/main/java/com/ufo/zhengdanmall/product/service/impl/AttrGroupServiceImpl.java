package com.ufo.zhengdanmall.product.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ufo.common.utils.PageUtils;
import com.ufo.common.utils.Query;

import com.ufo.zhengdanmall.product.dao.AttrGroupDao;
import com.ufo.zhengdanmall.product.entity.AttrGroupEntity;
import com.ufo.zhengdanmall.product.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogId) {
        String key = (String) params.get("key");
        if (catelogId == 0){
            QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<AttrGroupEntity>();
            //未点击三级分类也可以进行模糊查询
            if (StringUtils.isNotEmpty(key)){
                wrapper = new QueryWrapper<AttrGroupEntity>().eq("attr_group_id",key).or().like("attr_group_name",key);
            }
            //查询所有数据or查询带有key的所有数据
            IPage<AttrGroupEntity> page = this.page(
                    new Query<AttrGroupEntity>().getPage(params),
                    wrapper
            );
            return new PageUtils(page);
        }else{
            //查询条件:查出对应菜单分类id里的所有数据
            QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<AttrGroupEntity>().eq("catelog_id", catelogId);
            if (StringUtils.isNotEmpty(key)){
                //如果带有关键字（查询条件key），需再添加查询条件
                wrapper.and((obj)->{
                    obj.eq("attr_group_id",key).or().like("attr_group_name",key);
                });
            }
            IPage<AttrGroupEntity> page = this.page(
                    new Query<AttrGroupEntity>().getPage(params),
                    wrapper
            );
            return new PageUtils(page);
        }

    }

}