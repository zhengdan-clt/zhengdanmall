package com.ufo.zhengdanmall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZhengdanmallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengdanmallThirdPartyApplication.class, args);
    }

}
