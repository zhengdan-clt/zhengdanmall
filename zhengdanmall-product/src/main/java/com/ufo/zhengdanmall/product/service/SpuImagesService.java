package com.ufo.zhengdanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ufo.common.utils.PageUtils;
import com.ufo.zhengdanmall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zhengdan
 * @email 2238231374@qq.com
 * @date 2024-08-27 22:59:44
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

