package com.wuyifan.demo2.service.Impl;

import com.wuyifan.demo2.bean.Student;
import com.wuyifan.demo2.dao.StudentDao;
import com.wuyifan.demo2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student query(Integer id, String sname, String telephone) {
        return studentDao.query(id, sname, telephone);
    }
}
