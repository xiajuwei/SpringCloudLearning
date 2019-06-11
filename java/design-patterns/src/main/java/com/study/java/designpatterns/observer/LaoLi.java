package com.study.java.designpatterns.observer;

public class LaoLi implements Person {
    @Override
    public void message(String s) {
        System.out.println("老李收到信息: " + s);
    }
}
