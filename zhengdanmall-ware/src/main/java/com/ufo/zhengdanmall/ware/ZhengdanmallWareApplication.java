package com.ufo.zhengdanmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ufo.zhengdanmall.ware.dao")
@SpringBootApplication
public class ZhengdanmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengdanmallWareApplication.class, args);
    }

}
