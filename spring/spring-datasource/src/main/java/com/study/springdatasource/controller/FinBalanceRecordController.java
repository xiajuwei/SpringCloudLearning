package com.study.springdatasource.controller;


import com.github.pagehelper.PageInfo;
import com.study.springdatasource.pojo.FinBalanceRecord;
import com.study.springdatasource.service.FinBalanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
public class FinBalanceRecordController {
    @Autowired
    FinBalanceRecordService finBalanceRecordService;

    @RequestMapping("hello")
    public PageInfo<List<FinBalanceRecord>> listByPage() {

        PageInfo<List<FinBalanceRecord>> finBalanceRecordList = finBalanceRecordService.listByPage();

        return finBalanceRecordList;
    }


}
