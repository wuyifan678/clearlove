package com.wuyifan.demo2.service;

import com.wuyifan.demo2.bean.Student;

import java.util.List;

public interface StudentService {
    public Student query(Integer id, String sname, String telephone);
}
