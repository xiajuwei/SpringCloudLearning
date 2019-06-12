package com.study.java.designpatterns.chain;

/**
 * 抽象处理者
 */
public abstract class AbstractHandler {

    private AbstractHandler abstractHandler;

    public abstract void handleRequest(String str);

    public void setHandle(AbstractHandler abstractHandler) {
        this.abstractHandler = abstractHandler;
    }

    public AbstractHandler getHandle() {
        return abstractHandler;
    }


}
