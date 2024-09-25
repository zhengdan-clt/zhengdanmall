package com.ufo.zhengdanmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com/ufo/zhengdanmall/coupon/dao")
@SpringBootApplication
public class ZhengdanmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengdanmallCouponApplication.class, args);
    }

}
