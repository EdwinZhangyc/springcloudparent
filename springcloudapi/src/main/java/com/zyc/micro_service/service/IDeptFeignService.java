package com.zyc.micro_service.service;

import com.zyc.micro_service.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author zyc
 * @date 2018/12/31 12:08
 * @description
 */
//@FeignClient(value = "SPRINGCLOUD-DEPT")
// 当服务降级使用，出问题找到DeptClientServiceFallbackFactory类进行处理
@FeignClient(value = "SPRINGCLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface IDeptFeignService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
