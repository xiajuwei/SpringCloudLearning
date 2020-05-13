package com.study.springmongodb.controller;

import com.study.springmongodb.dao.MongoTestDao;
import com.study.springmongodb.pojo.EnvironData;
import com.study.springmongodb.pojo.MongoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@RestController
@RequestMapping("/mongo")
public class MongoTestC {

    @Autowired
    private MongoTestDao mtdao;
    @Resource
    private MongoTemplate mongoTemplate;


    @GetMapping("/mongoTest")
    public void test() throws InterruptedException {
        long start = System.currentTimeMillis();
        CountDownLatch latch = new CountDownLatch(100);
        ExecutorService executorService = new ThreadPoolExecutor(
                100,
                300,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>());
        for (int m = 0; m < 100; m++) {
            executorService.execute(() -> {
                List<EnvironData> environDataList = new ArrayList<>();
                for (int i = 0; i < 10000; i++) {
//            System.out.println(i);
                    EnvironData environData = new EnvironData();
                    environData.setID(System.currentTimeMillis() + i);
                    environData.setAUTHORIZEID("B2-2" + i);
                    environData.setCOLLECTTIME(String.valueOf(System.currentTimeMillis()));
                    environData.setDESCRIPTION("yx_no-" + i);
                    environData.setEDEVCODE("9" + i);
                    environData.setNAME("test");
                    environData.setVAL("test_" + i);
                    environData.setSTATIONID(1);
                    environData.setSTYPE(2);
                    environDataList.add(environData);
                }
                mongoTemplate.insert(environDataList, "t_environ_data_1");
                latch.countDown();
            });


        }
        latch.await(1, TimeUnit.HOURS);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("执行时间=====>>>>>" + time);


    }

    @GetMapping(value = "/test1")
    public void saveTest() throws Exception {
        MongoTest mgtest = new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(33);
        mgtest.setName("ceshi");
        mtdao.saveTest(mgtest);
    }

    @GetMapping(value = "/test2")
    public MongoTest findTestByName() {
        MongoTest mgtest = mtdao.findTestByName("ceshi");
        System.out.println("mgtest is " + mgtest);
        return mgtest;
    }

    @GetMapping(value = "/test3")
    public void updateTest() {
        MongoTest mgtest = new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mtdao.updateTest(mgtest);
    }

    @GetMapping(value = "/test4")
    public void deleteTestById() {
        mtdao.deleteTestById(11);
    }
}
