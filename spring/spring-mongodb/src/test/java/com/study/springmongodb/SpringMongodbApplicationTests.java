package com.study.springmongodb;

import com.study.springmongodb.dao.MongoTestDao;
import com.study.springmongodb.pojo.MongoTest;
import com.study.springmongodb.pojo.UserInfo;
import com.study.springmongodb.service.MongoService;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMongodbApplicationTests {
    @Autowired
    private MongoTestDao mtdao;

    @Autowired
    private MongoService mongoService;

    @Test
    public void contextLoads() {

        MongoTest mgtest = new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(33);
        mgtest.setName("ceshi");
        mtdao.saveTest(mgtest);

    }

    @Test
    public void test1() {
        MongoTest mgtest = mtdao.findTestByName("ceshi");
        System.out.println("mgtest is " + mgtest);
    }

    @Test
    public void test2() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(2);
        userInfo.setUsername("张三");
        userInfo.setPassword("123456");
        mongoService.save(userInfo);


    }

    @Test
    public void test3() {
        UserInfo userInfo = mongoService.findTestByName("张三");
        System.out.println(userInfo);

    }

    @Test
    public void test4() {
        UserInfo userInfo = mongoService.findTestById(1);
        System.out.println(userInfo);

    }

    @Test
    public void test5() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setUsername("张三");
        userInfo.setPassword("123456");
        mongoService.update(userInfo);
    }

    @Test
    public void test6() {

        mongoService.delete(1);

    }

    @Test
    public void test7() {
        List<UserInfo> list = mongoService.find("张三");
        System.out.println(list);
    }

    @Test
    public void test8() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("张三");
        userInfo.setPassword("1111111");
        mongoService.updateAll(userInfo);
    }


}
