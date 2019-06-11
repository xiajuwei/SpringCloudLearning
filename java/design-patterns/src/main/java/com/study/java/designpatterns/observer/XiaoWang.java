package com.study.java.designpatterns.observer;

public class XiaoWang implements Person {

    @Override
    public void message(String s) {
        System.out.println("小王收到信息：" + s);
    }
}
