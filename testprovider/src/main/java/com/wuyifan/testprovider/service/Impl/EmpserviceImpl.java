package com.wuyifan.testprovider.service.Impl;

import com.wuyifan.testprovider.bean.EmpBean;
import com.wuyifan.testprovider.dao.EmpDao;
import com.wuyifan.testprovider.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpserviceImpl implements Empservice {
    @Autowired
    EmpDao empDao;

    @Override
    public List<EmpBean> queryEmp() {
        return empDao.queryEmp();
    }
}
