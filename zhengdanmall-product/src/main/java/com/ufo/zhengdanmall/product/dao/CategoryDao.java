package com.ufo.zhengdanmall.product.dao;

import com.ufo.zhengdanmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhengdan
 * @email 2238231374@qq.com
 * @date 2024-08-27 22:59:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
