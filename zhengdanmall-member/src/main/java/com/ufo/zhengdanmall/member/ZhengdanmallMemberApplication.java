package com.ufo.zhengdanmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.ufo.zhengdanmall.member.feign")
@EnableDiscoveryClient
@MapperScan("com.ufo.zhengdanmall.member.dao")
@SpringBootApplication
public class ZhengdanmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengdanmallMemberApplication.class, args);
    }

}
