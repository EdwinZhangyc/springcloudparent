package com.zyc.micro_service.service;


import com.zyc.micro_service.entities.Dept;

import java.util.List;

/**
 * @author zyc
 * @date 2018/12/30 10:00
 * @description
 */
public interface IDeptService {

    Dept findById (Long deptno);
    List<Dept> findAll ();
    boolean addDept (Dept dept);
}
