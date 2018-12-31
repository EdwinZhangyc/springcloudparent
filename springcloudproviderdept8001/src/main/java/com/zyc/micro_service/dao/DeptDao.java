package com.zyc.micro_service.dao;

import com.zyc.micro_service.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zyc
 * @date 2018/12/30 9:57
 * @description
 */
@Mapper
public interface DeptDao {

    Dept findById (Long deptno);
    List<Dept> findAll ();
    boolean addDept (Dept dept);
}