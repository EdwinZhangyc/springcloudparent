package com.zyc.micro_service.service.impl;

import com.zyc.micro_service.entities.Dept;
import com.zyc.micro_service.dao.DeptDao;
import com.zyc.micro_service.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyc
 * @date 2018/12/30 10:01
 * @description
 */
@Service("deptSevice")
public class DeptSeviceImpl implements IDeptService {

    @Autowired
    private DeptDao deptDao;


    @Override
    public Dept findById(Long deptno) {
        return deptDao.findById(deptno);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
}