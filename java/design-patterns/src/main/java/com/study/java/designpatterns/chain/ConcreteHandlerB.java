package com.study.java.designpatterns.chain;

/**
 * 具体处理者
 */
public class ConcreteHandlerB extends AbstractHandler {
    @Override
    public void handleRequest(String str) {
        if ("B".equals(str)) {
            System.out.println("ConcreteHandlerB 处理");
        } else {
            System.out.println("ConcreteHandlerB 不处理");
            super.getHandle().handleRequest(str);

        }

    }
}
