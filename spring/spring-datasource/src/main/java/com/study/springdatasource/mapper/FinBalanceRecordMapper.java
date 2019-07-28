package com.study.springdatasource.mapper;

import com.study.springdatasource.pojo.FinBalanceRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinBalanceRecordMapper {

    List<FinBalanceRecord> listByPage();

}