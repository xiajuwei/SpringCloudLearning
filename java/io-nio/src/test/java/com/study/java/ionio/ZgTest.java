package com.study.java.ionio;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ZgTest {
    @Test
    public void test2() {

        StringBuffer sb = new StringBuffer();
        sb.append("http://u2.huatu.com/anhui/fj/2018ahskzt/ahsk%20(");
        sb.append(1);
        sb.append(").jpg");
        System.out.println(sb.toString());

    }

    @Test
    public void test1() throws Exception {


        ExecutorService executorService = new ThreadPoolExecutor(5, 20, 60L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        for (int i = 1; i < 79; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append("http://u2.huatu.com/anhui/fj/2018ahskzt/ahsk%20(");
            sb.append(i);
            sb.append(").jpg");

            String name = i + ".jpg";
            executorService.execute(() -> {

                downloadByNIO(sb.toString(), "G:\\jc", name);


            });
            System.out.println("下载数量: " + i);

        }
        executorService.shutdown();

    }

    public static void downloadByNIO(String url, String saveDir, String fileName) {
        System.out.println("开始下载: " + fileName);
        ReadableByteChannel rbc = null;
        FileOutputStream fos = null;
        FileChannel foutc = null;
        try {
            rbc = Channels.newChannel(new URL(url).openStream());
            File file = new File(saveDir, fileName);
            file.getParentFile().mkdirs();
            fos = new FileOutputStream(file);
            foutc = fos.getChannel();
            foutc.transferFrom(rbc, 0, Long.MAX_VALUE);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (rbc != null) {
                try {
                    rbc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (foutc != null) {
                try {
                    foutc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("下载结束: " + fileName);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(5, 20, 60L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        for (int i = 1; i < 79; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append("http://u2.huatu.com/anhui/fj/2018ahskzt/ahsk%20(");
            sb.append(i);
            sb.append(").jpg");

            String name = i + ".jpg";
            executorService.execute(() -> {

                downloadByNIO("https://pan.baidu.com/s/1e_IUT8DhUbV-iZOzcWuBMQ", "G:\\jc", name);


            });
            System.out.println("下载数量: " + i);

        }
        executorService.shutdown();


    }


}



