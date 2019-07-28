package com.study.springdatasource.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.study.springdatasource.mapper")
public class DataSourceConfig {
}
