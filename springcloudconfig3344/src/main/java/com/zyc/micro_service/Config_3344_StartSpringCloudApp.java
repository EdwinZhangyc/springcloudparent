package com.zyc.micro_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zyc
 * @date 2018/12/31 18:16
 * @description
 */
@SpringBootApplication
// 开启中配置
@EnableConfigServer
public class Config_3344_StartSpringCloudApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
    }
}