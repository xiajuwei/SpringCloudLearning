package com.study.java.designpatterns.observer;

public interface Person {
    //小王和小李通过这个接口可以接收到小美发过来的消息
    void message(String s);
}
