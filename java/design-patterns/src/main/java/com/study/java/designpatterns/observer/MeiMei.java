package com.study.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MeiMei {

    List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    //美美发送消息遍历到所有观察者
    public void noticePerson() {
        for (Person person : personList) {
            person.message("美美发送消息");
        }

    }


}
