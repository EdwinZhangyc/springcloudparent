package com.zyc.micro_service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zyc
 * @date 2018/12/28 20:50
 * @description
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable {

    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

}