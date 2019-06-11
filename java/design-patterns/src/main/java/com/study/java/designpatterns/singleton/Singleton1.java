package com.study.java.designpatterns.singleton;

/**
 * 饿汉式（静态常量）[可用]
 * 优点：写法简单,在类装载的时候就完成实例化。避免线程同步问题
 * 缺点：在类装载的时候就完成实例化，如果没有使用过这个实例，会造成内存的浪费
 */
public class Singleton1 {

    private static final Singleton1 singleton1 = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {

        return singleton1;

    }


}
