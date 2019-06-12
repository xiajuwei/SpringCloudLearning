package com.study.java.designpatterns.chain;

/**
 * 具体处理者
 */
public class ConcreteHandlerA extends AbstractHandler {
    @Override
    public void handleRequest(String str) {
        if ("A".equals(str)) {
            System.out.println("ConcreteHandlerA 处理");
        } else {
            System.out.println("ConcreteHandlerA 不处理");
            super.getHandle().handleRequest(str);
        }
    }
}
