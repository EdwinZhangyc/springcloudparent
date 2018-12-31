package com.zyc.micro_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zyc
 * @date 2018/12/30 10:08
 * @description
 */
@SpringBootApplication
// 本服务启动将会自动注册到 Eureka Server 中
// 首先需要在 yml 中进行配置，以及在 pom.xml中添加 Eureka 相关依赖
@EnableEurekaClient
public class DeptProvider8002_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}