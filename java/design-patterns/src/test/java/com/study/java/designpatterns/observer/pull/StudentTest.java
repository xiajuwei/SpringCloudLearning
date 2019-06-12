package com.study.java.designpatterns.observer.pull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentTest {
    @Test
    public void test1() {
        Student student = new Student();
        PersonA personA = new PersonA();
        PersonB personB = new PersonB();
        //向目标对象注册观察者
        student.add(personA);
        student.add(personB);

        student.notifyObserver("拉取消息");

    }


}
