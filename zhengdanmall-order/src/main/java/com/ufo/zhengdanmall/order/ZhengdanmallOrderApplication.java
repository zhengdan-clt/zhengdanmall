package com.ufo.zhengdanmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ufo.zhengdanmall.order.dao")
@SpringBootApplication
public class ZhengdanmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengdanmallOrderApplication.class, args);
    }

}
