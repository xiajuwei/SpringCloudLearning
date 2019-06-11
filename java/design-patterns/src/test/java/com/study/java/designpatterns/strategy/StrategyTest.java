package com.study.java.designpatterns.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StrategyTest {

    @Test
    public void test1() {
        //选择并创建需要使用的策略对象
        Buyer buyer = new VipBuyer();
        //创建上下文
        Cashier cashier = new Cashier(buyer);
        BigDecimal price = cashier.quote(BigDecimal.valueOf(1260));
        System.out.println("会员价格：" + price);




    }
}
