package com.ufo.zhengdanmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ufo.common.utils.PageUtils;
import com.ufo.zhengdanmall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author zhengdan
 * @email 2238231374@qq.com
 * @date 2024-08-29 14:58:28
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

