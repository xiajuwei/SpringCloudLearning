package com.study.java.threadpool;


import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ThreadPoolApplicationTests {

//    @Test
//    public void contextLoads() {
//    }

    /**
     * corePoolSize 和 maximumPoolSize
     * 默认情况下线程中的线程初始时为 0， 当有新的任务到来时才会创建新线程，当线程数目到达 corePoolSize 的数量时，
     * 新的任务会被缓存到 workQueue 队列中。如果不断有新的任务到来，队列也满了的话，线程池会再新建线程直到总的线程数目达到 maximumPoolSize。
     * 如果还有新的任务到来，则要根据 handler 对新的任务进行相应拒绝处理。
     */

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("notice-%d").build();
        /**
         * TimeUnit.DAYS; //天
         * 　　TimeUnit.HOURS; //小时
         * 　　TimeUnit.MINUTES; //分钟
         * 　　TimeUnit.SECONDS; //秒
         * 　　TimeUnit.MILLISECONDS; //毫秒
         * 　　TimeUnit.MICROSECONDS; //微妙
         * 　　TimeUnit.NANOSECONDS; //纳秒
         */
        ExecutorService executorService = new ThreadPoolExecutor(
                1, //corePoolSize：核心线程池大小， 当新的任务到线程池后，线程池会创建新的线程（即使有空闲线程），直到核心线程池已满。
                2, //maximumPoolSize：最大线程池大小，顾名思义，线程池能创建的线程的最大数目
                6L,//keepAliveTime：程池的工作线程空闲后，保持存活的时间
                TimeUnit.MINUTES,//TimeUnit： 时间单位
                new LinkedBlockingQueue(5),//BlockingQueue<Runnable>：用来储存等待执行任务的队列
                threadFactory,//threadFactory：线程工厂
                new ThreadPoolExecutor.AbortPolicy());
        List<String> list = Arrays.asList("one", "two", "three", "four", "five");

        for (int i = 0; i < list.size(); i++) {
            /**
             * 1.对返回值的处理不同
             * execute方法不关心返回值。
             * submit方法有返回值，Future.
             * 2.对异常的处理不同
             * excute方法会抛出异常。
             * sumbit方法不会抛出异常。除非你调用Future.get()
             */
            String str = list.get(i);
//            executorService.execute(() -> test(student)); //
            Future<String> future = executorService.submit(() -> test(str));

//            System.out.println(future.get());

        }
        executorService.shutdown();
        //每隔一秒钟检查一次是否执行完毕（
        while (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("线程还在执行");
        }


    }

    private static String test(String str) {
//        System.out.println(DateTime.now().toString(""));
        System.out.println(Thread.currentThread().getName() + str);
        return str;

    }


}

class Student {

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
