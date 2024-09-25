package com.ufo.zhengdanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ufo.common.utils.PageUtils;
import com.ufo.zhengdanmall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author zhengdan
 * @email 2238231374@qq.com
 * @date 2024-08-27 22:59:44
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

