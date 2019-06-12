package com.study.java.designpatterns.observer.pull;

public class PersonA implements Observer {
    @Override
    public void update(Student student) {


        System.out.println("personA 获取信息：" + student.getMessage());
    }
}
