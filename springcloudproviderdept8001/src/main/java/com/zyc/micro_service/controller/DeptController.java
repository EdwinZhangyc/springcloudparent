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
    public Dept get(@PathVariable("deptno") Long deptno) {
        return deptService.findById(deptno);
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
