package com.study.jdk8;

import java.util.concurrent.*;

public class CountDownLatchTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                try {
                    countDownLatch.await();
                    System.out.println("Thread:" + Thread.currentThread().getName() + ", time:" + System.currentTimeMillis());
                    System.out.println("Thread:" + Thread.currentThread().getName() + ",");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        countDownLatch.countDown();
        executorService.shutdown();

    }


}
