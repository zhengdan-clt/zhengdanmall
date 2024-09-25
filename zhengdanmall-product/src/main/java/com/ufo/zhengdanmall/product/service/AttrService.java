package com.ufo.zhengdanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ufo.common.utils.PageUtils;
import com.ufo.zhengdanmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zhengdan
 * @email 2238231374@qq.com
 * @date 2024-08-27 22:59:44
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

