package com.study.java.designpatterns.observer.pull;

/**
 * 创建观察接口
 * 定义一个更新接口通知观察者更新
 */
public interface Observer {
    //更新方法
    void update(Student student);

}
