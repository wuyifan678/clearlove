package com.wuyifan.testprovider.controller;

import com.wuyifan.testprovider.bean.EmpBean;
import com.wuyifan.testprovider.service.Empservice;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
public class EmpController {
    @Autowired
    Empservice empservice;

    @RequestMapping("query")
    public List<EmpBean> query() {
        return empservice.queryEmp();
    }

    @RequestMapping("download")
    public int download() throws IOException {
        //查出emp表的数据
        List<EmpBean> empBeans = empservice.queryEmp();

        //创建新的excel工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建一张表
        HSSFSheet sheet = workbook.createSheet("员工表");

        //创建标题行
        HSSFRow th = sheet.createRow(0);

        th.createCell(0).setCellValue("员工编号");
        th.createCell(1).setCellValue("员工名称");
        th.createCell(2).setCellValue("职位");
        th.createCell(3).setCellValue("上级编号");
        th.createCell(4).setCellValue("月工资");
        th.createCell(5).setCellValue("佣金");
        th.createCell(6).setCellValue("部门编号");
        //遍历list，向xsl里添加内容
        for (EmpBean empBean : empBeans) {
            int lastrow = sheet.getLastRowNum();
            HSSFRow datarow = sheet.createRow(lastrow + 1);
            datarow.createCell(0).setCellValue(empBean.getEMPNO());
            datarow.createCell(1).setCellValue(empBean.getENAME());
            datarow.createCell(2).setCellValue(empBean.getJOB());
            //datarow.createCell(3).setCellValue(empBean.getMGR());
            datarow.createCell(4).setCellValue(empBean.getSAL());
            datarow.createCell(5).setCellValue(empBean.getCOMM());
            datarow.createCell(6).setCellValue(empBean.getDEPTNO());
        }
        //新建——输出文件流
        FileOutputStream fos = new FileOutputStream("D:\\员工信息.xlsx");
        //存盘
        workbook.write(fos);

        fos.flush();
        fos.close();
        return 0;
    }


}
