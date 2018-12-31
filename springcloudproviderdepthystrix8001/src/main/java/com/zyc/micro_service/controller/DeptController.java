package com.zyc.micro_service.controller;

import com.zyc.micro_service.entities.Dept;
import com.zyc.micro_service.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zyc
 * @date 2018/12/30 9:56
 * @description
 */
@RestController
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @GetMapping("/dept/get/{deptno}")
    // 熔断处理
    //@HystrixCommand(fallbackMethod = "execException")
    public Dept get(@PathVariable("deptno") Long deptno) {
        Dept dept = deptService.findById(deptno);
        if (dept == null) {
            throw new RuntimeException("该ID： " + deptno + "没有对应的信息。");
        }
        return dept;
    }

    private Dept execException (@PathVariable("id") Long id) {
        return new Dept().setDname("该ID： " + id + "没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

    @GetMapping("/dept/list")
    public List<Dept> list () {
        return deptService.findAll();
    }

    @PostMapping("/dept/add")
    public boolean add (@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }



}
