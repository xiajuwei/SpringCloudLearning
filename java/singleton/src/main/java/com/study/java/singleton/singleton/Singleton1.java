package com.study.java.singleton.singleton;

/**
 * 懒汉式
 * 优点：写法简单,在类装载的时候就完成实例化。避免线程同步问题
 * 缺点：在类装载的时候就完成实例化，如果没有使用过这个实例，会造成内存的浪费
 */
public class Singleton1 {

    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {

        return INSTANCE;
    }


}

class Singletn2(){

        }

