package com.wuyifan.testprovider.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmpBean implements Serializable {
    //员工编号
    private Integer EMPNO;
    //员工名称
    private String ENAME;
    //职位
    private String JOB;
    //上级编号
    private Integer MGR;
    //月工资
    private Integer SAL;
    //佣金
    private Integer COMM;
    //部门编号
    private Integer DEPTNO;

}
