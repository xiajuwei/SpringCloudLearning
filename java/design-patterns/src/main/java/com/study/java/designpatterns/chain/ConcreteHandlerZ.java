package com.study.java.designpatterns.chain;

/**
 * 具体处理者
 */
public class ConcreteHandlerZ extends AbstractHandler {
    @Override
    public void handleRequest(String str) {
        System.out.println("ConcreteHandlerZ 处理");
    }
}
