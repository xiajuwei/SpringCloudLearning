package com.study.jdk8.db;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class Student {

    private Long id;
    @NotNull
    private String userName;
    @NotNull(message = "年龄不能为空")
    private Integer age;


}
