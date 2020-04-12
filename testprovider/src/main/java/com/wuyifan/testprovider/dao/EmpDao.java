package com.wuyifan.testprovider.dao;

import com.wuyifan.testprovider.bean.EmpBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDao {

    //往Emp表里添加数据,从excel里获取一个集合
    public int addEmp(List<EmpBean> empBeans);

    //查询emp表
    public List<EmpBean> queryEmp();

}
