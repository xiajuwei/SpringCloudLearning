package com.study.java.designpatterns.adapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdapterTest {
    @Test
    public void test1() {
        Phone phone = new Phone();
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        phone.setVoltageAdapter(voltageAdapter);
        phone.charge();

    }

}
