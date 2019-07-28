package com.study.java.ionio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NIOTest {
    @Test
    public void test1() {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("E:/io-nio-test/nio.txt");
            out = new FileOutputStream("E:/io-nio-test/nio-write.txt");
            FileChannel inChannel = in.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int count = inChannel.read(buffer);
            while (count != -1) {
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                buffer.flip();
                FileChannel outChannel = out.getChannel();
                outChannel.write(buffer);
                buffer.compact();
                count = inChannel.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        RandomAccessFile readerFile = null;
        RandomAccessFile writerFile = null;

        try {
            readerFile = new RandomAccessFile("F:/windows_10_x64.iso", "rw");
            writerFile = new RandomAccessFile("F:/windows_10_x64_copy.iso", "rw");
            //通道
            FileChannel readerChannel = readerFile.getChannel();
            FileChannel writerChannel = writerFile.getChannel();

            long start = System.currentTimeMillis();
            //分配堆内存缓存区空间
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int count = readerChannel.read(buffer);
            while (count != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    writerChannel.write(buffer);
                }
                buffer.compact();
                count = readerChannel.read(buffer);
            }
            long end = System.currentTimeMillis();
            System.out.println("运行时间：" + (end - start) + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readerFile.close();
                writerFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 处理大文件
     */

    @Test
    public void test3() {
        RandomAccessFile readerFile = null;
        RandomAccessFile writerFile = null;

        try {
            readerFile = new RandomAccessFile("F:/windows_10_x64.iso", "rw");
            writerFile = new RandomAccessFile("F:/windows_10_x64_copy.iso", "rw");
            long start = System.currentTimeMillis();
            //通道
            FileChannel readerChannel = readerFile.getChannel();
            FileChannel writerChannel = writerFile.getChannel();
            //将文件直接映射到内存（这里的内存指的是虚拟内存，并不是物理内存）
            MappedByteBuffer buffer = readerChannel.map(FileChannel.MapMode.READ_WRITE, 0, Integer.MAX_VALUE);
            int count = readerChannel.read(buffer);
            while (count != -1) {
                //position 设回0，limit 设成position 的值
                buffer.flip();
                writerChannel.write(buffer);
                buffer.compact();
                count = readerChannel.read(buffer);
            }
            long end = System.currentTimeMillis();
            System.out.println("运行时间：" + (end - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readerFile.close();
                writerFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * transferFrom
     */
    @Test
    public void test4() {
        RandomAccessFile readerFile = null;
        RandomAccessFile writerFile = null;

        try {
            readerFile = new RandomAccessFile("F:/迅雷下载/deepin-15.10.1-amd64.iso", "rw");
            writerFile = new RandomAccessFile("F:/迅雷下载/deepin.iso", "rw");
            long start = System.currentTimeMillis();
            //通道
            FileChannel readerChannel = readerFile.getChannel();
            FileChannel writerChannel = writerFile.getChannel();
            writerChannel.transferFrom(readerChannel, 0, readerFile.length());
            long end = System.currentTimeMillis();
            System.out.println("运行时间：" + (end - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readerFile.close();
                writerFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    /**
     * transferTo
     */
    @Test
    public void test5() {
        RandomAccessFile readerFile = null;
        RandomAccessFile writerFile = null;

        try {
            readerFile = new RandomAccessFile("F:/迅雷下载/deepin-15.10.1-amd64.iso", "rw");
            writerFile = new RandomAccessFile("F:/迅雷下载/deepin.iso", "rw");
            long start = System.currentTimeMillis();
            //通道
            FileChannel readerChannel = readerFile.getChannel();
            FileChannel writerChannel = writerFile.getChannel();
            readerChannel.transferTo(0, readerFile.length(), writerChannel);
            long end = System.currentTimeMillis();
            System.out.println("运行时间：" + (end - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readerFile.close();
                writerFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


}
