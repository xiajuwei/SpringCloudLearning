package com.study.springdatasource;

import com.github.pagehelper.PageInfo;
import com.study.springdatasource.pojo.FinBalanceRecord;
import com.study.springdatasource.service.FinBalanceRecordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDatasourceApplicationTests {
    @Autowired
    FinBalanceRecordService finBalanceRecordService;

    @Test
    public void contextLoads() {
        PageInfo<List<FinBalanceRecord>> pageInfo = finBalanceRecordService.listByPage();
        System.out.println(pageInfo);

    }

}
