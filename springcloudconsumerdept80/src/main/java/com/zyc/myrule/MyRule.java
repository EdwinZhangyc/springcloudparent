package com.zyc.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zyc
 * @date 2018/12/31 9:59
 * @description  当ribbon自带负载算法不满足需求时
 *               采用自定义ribbon算法
 */
@Configuration
public class MyRule {

    @Bean
    public IRule myRibbonRule () {
        // 首先自定义为随机算法来替换默认轮询算法
        // ，进行测试，看看该自定义类是否生效
        //return new RandomRule();
        // 采用自定义负载算法
        return new MyRandomRule();
    }
}