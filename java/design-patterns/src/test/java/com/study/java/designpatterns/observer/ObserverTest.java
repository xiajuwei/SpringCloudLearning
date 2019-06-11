package com.study.java.designpatterns.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ObserverTest {
    @Test
    public void test1() {
        MeiMei meiMei = new MeiMei();
        XiaoWang xiaoWang = new XiaoWang();
        LaoLi laoLi = new LaoLi();

        //小王和小李在小美那里都注册了一下
        meiMei.addPerson(xiaoWang);
        meiMei.addPerson(laoLi);
        //美美发送消息
        meiMei.noticePerson();


    }


}
