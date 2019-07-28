package com.study.jdk8;

import com.study.jdk8.db.Student;
import com.study.jdk8.db.Student1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BeanUtilTest {

    @Test
    public void test1() {
        Student student = Student.builder()
                .id(1l)
                .userName("张三")
                .age(10).build();

        Student1 student1 = new Student1();


        BeanUtils.copyProperties(student, student1);

        System.out.println(student1);


    }


}


