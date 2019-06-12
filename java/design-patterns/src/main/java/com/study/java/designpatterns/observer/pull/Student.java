package com.study.java.designpatterns.observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建目标对象（被观察者）
 */
public class Student {
    private String message;

    public String getMessage() {
        return message;
    }

    List<Observer> observerList = new ArrayList<>();

    //添加注册观察者对象
    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObserver(String message) {
        this.message = message;
        //发送目标对象
        for (Observer observer : observerList) {
            observer.update(this);
        }


    }

}
