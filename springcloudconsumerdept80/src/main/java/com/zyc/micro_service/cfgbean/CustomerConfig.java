package com.zyc.micro_service.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zyc
 * @date 2018/12/30 10:59
 * @description
 */
@Configuration
public class CustomerConfig {

    @Bean
    // 使用Ribbon进行负载均衡  Ribbon是基于客户端进行负载的
    // 默认采用轮询算法  设置算法使用实现 IRule接口进行实现
    @LoadBalanced
    public RestTemplate restTemplate () {

        return new RestTemplate();
    }

    // 2、使用自定义算法，在主配置类中进行配置
    // 1、配置 Ribbon 算法替换默认轮询算法 重启所有服务
    //@Bean
    //public IRule myRule () {
    //    // 轮询算法
    //    //return new RoundRobinRule();
    //    // 随机算法
    //    //return new RandomRule();
    //    // 正常时默认轮询算法，但一旦遇到宕机的生产者服务会自动切换
    //    return new RetryRule();
    //}
}