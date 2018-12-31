package com.zyc.micro_service;

import com.zyc.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author zyc
 * @date 2018/12/30 11:12
 * @description
 */
@SpringBootApplication
// 由于Ribbon需要使用Eureka注册，所以在配置类中开启Eureka配置
@EnableEurekaClient
// 自定义ribbon 负载算法，声明微服务名称，
// 同时注意自定义算法的类不能在本主配置类包下（很重要，否则不生效）
@RibbonClient(name = "SPRINGCLOUD-DEPT", configuration = MyRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}