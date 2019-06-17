package com.study.java.ionio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IOTest {
    @Test
    public void test1() {
        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream("E:/io-nio-test/io.txt");
            out = new FileOutputStream("E:/io-nio-test/io-write.txt");
            byte[] bytes = new byte[1024];

            int count = in.read(bytes);
            while (count != -1) {
                for (int i = 0; i < count; i++) {
                    System.out.print((char) bytes[i]);
                }
                out.write(bytes);
                count = in.read(bytes);
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
            reader = new FileReader("E:/io-nio-test/io.txt");
            writer = new FileWriter("E:/io-nio-test/io-write.txt");
            char[] chars = new char[1024];
            int count = reader.read(chars);
            while (count != -1) {
                for (int i = 0; i < count; i++) {
                    System.out.print(chars[i]);
                }
                writer.write(chars);
                count = reader.read(chars);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
