package com.zyc.micro_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zyc
 * @date 2018/12/30 15:28
 * @description
 */
@SpringBootApplication
@EnableEurekaServer  // 声明该服务为 eureka server 端
public class EurekaServerConfig_7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfig_7003.class, args);
    }
}