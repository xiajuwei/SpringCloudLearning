package com.study.java.ionio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.nio.ByteBuffer;
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
                buffer.flip();
                FileChannel outChannel = out.getChannel();
                outChannel.write(buffer);
                while (buffer.hasRemaining()) {
                    System.out.println((char) buffer.get());
                }
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
        Reader reader = null;
        Writer writer = null;

        try {
            reader = new FileReader("E:/io-nio-test/nio.txt");
            writer = new FileWriter("E:/io-nio-test/nio-write.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
