package com.study.jdk8;

import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StringTest {
    @Test
    public void test1() {

        String msg1 = String.format("First %s and then %s", "foo", "bar");
        System.out.println(msg1);
        String msg2 = String.format("Display %2$d and then %d", 1, 3);
        System.out.println(msg2);
        String msg3 = String.format("Too many arguments %d %d", 1, 2);
        System.out.println(msg3);
        String msg4 = String.format("First Line%n");
        System.out.println(msg4);
//        String.format("Is myObject null ? %b", myObject == null);
//        String.format("value is %d", value);

        String msg = String.format("<font color=#FF0000>富民对公交易结果异常</font>\\n\\n异常时间：%s\\n\\n异常信息：%s\\n\\n申请单号：%s\\n", DateTime.now().toString("yyyy-MM-dd HH:mm:ss"), "异常" + ",网络异常", "13");
        System.out.println(msg);

    }

    @Test
    public void test2() {
        List<StringTest> list = new ArrayList<>();

        for (; ; ) {
            list.add(new StringTest());
        }
//        add();


    }

    public void add() {
        add();


    }


}

