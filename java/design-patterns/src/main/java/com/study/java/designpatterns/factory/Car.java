package com.study.java.designpatterns.factory;

/**
 * 简单工厂模式：一个抽象的接口，多个抽象接口的实现类，一个工厂类，用来实例化抽象的接口
 */
public abstract class Car {

    abstract void run();

    abstract void stop();

}

class BenChi extends Car {

    @Override
    void run() {
        System.out.println("奔驰启动。。。");
    }

    @Override
    void stop() {
        System.out.println("奔驰停止。。。");
    }
}

class BMW extends Car {

    @Override
    void run() {
        System.out.println("宝马启动。。。");
    }

    @Override
    void stop() {
        System.out.println("宝马停止。。。");
    }
}

/**
 * 工厂类
 */

class Factory {

    public static Car getInstance(String type) {

        Car car = null;
        if ("BenChi".equals(type)) {
            car = new BenChi();
        } else if ("BMW".equals(type)) {
            car = new BMW();
        }
        return car;

    }


}
