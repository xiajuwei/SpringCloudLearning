package com.study.jdk8;

import com.study.jdk8.db.Student;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NotNullTest {


    @Test
    public void test1() {

        Person person = new Person();
        person.setName("");
        Student student = Student.builder()
                .userName(person.getName()).build();
        System.out.println(student);


    }

}

@Data
class Person {
    private String name;
    private Integer age;


}

