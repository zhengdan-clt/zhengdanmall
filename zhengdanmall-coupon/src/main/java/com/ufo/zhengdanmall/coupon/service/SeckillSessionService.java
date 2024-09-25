package com.ufo.zhengdanmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ufo.common.utils.PageUtils;
import com.ufo.zhengdanmall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author zhengdan
 * @email 2238231374@qq.com
 * @date 2024-08-29 14:58:28
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

