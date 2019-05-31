package com.study.jdk8;

import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DateTimeTest {

    @Test
    public void test(){
        DateTime dateTime = DateTime.now();
        System.out.println(dateTime);

        System.out.println(dateTime.toString("yyyy-mm-dd HH:MM:SS"));


    }

}
