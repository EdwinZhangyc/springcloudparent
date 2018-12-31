package com.zyc.micro_service.service;

import com.zyc.micro_service.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zyc
 * @date 2018/12/31 16:00
 * @description 该类作用于服务降级使用
 *               同时可以作为服务熔断处理，由于熔断处理需要在每个方法上加注解
 *               导致方法变得很臃肿，重复，这样可以直接提到一个接口里，方便管理
 */
@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<IDeptFeignService>
{
    @Override
    public IDeptFeignService create(Throwable throwable)
    {
        return new IDeptFeignService() {
            @Override
            public Dept get(long id)
            {
                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list()
            {
                return null;
            }

            @Override
            public boolean add(Dept dept)
            {
                return false;
            }
        };
    }
}
