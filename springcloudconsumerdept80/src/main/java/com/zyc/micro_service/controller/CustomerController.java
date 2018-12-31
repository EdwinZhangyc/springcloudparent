package com.zyc.micro_service.controller;

import com.zyc.micro_service.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author zyc
 * @date 2018/12/30 11:01
 * @description
 */
@RestController
public class CustomerController {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    //可以通过微服务实际名称进行访问
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-DEPT";
    //private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-CONFIG-DEPT-CLIENT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/dept/add")
    public boolean add (Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, boolean.class );
    }


    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get (@PathVariable("id") Long id) {
        return restTemplate.getForObject (REST_URL_PREFIX + "/dept/get/"+ id, Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list () {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }


}