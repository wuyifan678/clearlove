package com.wuyifan.testprovider.service;

import com.wuyifan.testprovider.bean.EmpBean;

import java.util.List;

public interface Empservice {
    //查询emp表
    public List<EmpBean> queryEmp();
}
