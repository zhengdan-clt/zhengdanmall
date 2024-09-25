package com.ufo.zhengdanmall.order.dao;

import com.ufo.zhengdanmall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zhengdan
 * @email 2238231374@qq.com
 * @date 2024-08-29 17:32:21
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
