package com.study.java.threadpool;

import java.util.HashMap;

public class ThreadPoolTest {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }


    }


}


class MyThread extends Thread {
    HashMap hashMap = new HashMap();
    public int m = 3;

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            if (m == j) {

            }
        }
    }

}
