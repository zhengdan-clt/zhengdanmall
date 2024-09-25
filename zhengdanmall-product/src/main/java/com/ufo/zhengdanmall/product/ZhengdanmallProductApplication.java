package com.ufo.zhengdanmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com/ufo/zhengdanmall/product/dao")
@SpringBootApplication
public class ZhengdanmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengdanmallProductApplication.class, args);
    }

}
