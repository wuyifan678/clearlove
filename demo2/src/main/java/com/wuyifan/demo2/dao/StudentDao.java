package com.wuyifan.demo2.dao;

import com.wuyifan.demo2.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentDao {

    public Student query(Integer id,String sname,String telephone);
}
