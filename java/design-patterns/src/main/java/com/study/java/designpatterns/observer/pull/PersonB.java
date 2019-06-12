package com.study.java.designpatterns.observer.pull;

public class PersonB implements Observer {
    @Override
    public void update(Student student) {
        System.out.println("personB 获取信息："+ student.getMessage());
    }
}
