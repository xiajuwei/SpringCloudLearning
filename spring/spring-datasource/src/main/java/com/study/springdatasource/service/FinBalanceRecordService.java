package com.study.springdatasource.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.springdatasource.mapper.FinBalanceRecordMapper;
import com.study.springdatasource.pojo.FinBalanceRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FinBalanceRecordService {
    @Autowired
    FinBalanceRecordMapper finBalanceRecordMapper;

    public PageInfo<List<FinBalanceRecord>> listByPage() {
        PageHelper.startPage(1, 15);
        List<FinBalanceRecord> finBalanceRecordList = finBalanceRecordMapper.listByPage();
        PageInfo pageInfo = new PageInfo(finBalanceRecordList, 1);
        System.out.println(pageInfo);
        return pageInfo;
    }


}
