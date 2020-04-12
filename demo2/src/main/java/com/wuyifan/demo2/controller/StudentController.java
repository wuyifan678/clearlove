package com.wuyifan.demo2.controller;

import com.wuyifan.demo2.bean.Student;
import com.wuyifan.demo2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("query")
    public Student query(Integer id, String sname,String telephone){
        return studentService.query(id,sname,telephone);
    }

}
