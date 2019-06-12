package com.study.java.designpatterns.chain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ChainTest {
    @Test
    public void test1() {
        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA();
        ConcreteHandlerB concreteHandlerB = new ConcreteHandlerB();
        ConcreteHandlerZ concreteHandlerZ = new ConcreteHandlerZ();

        concreteHandlerA.setHandle(concreteHandlerB);
        concreteHandlerB.setHandle(concreteHandlerZ);
        concreteHandlerA.handleRequest("Z");



    }


}
