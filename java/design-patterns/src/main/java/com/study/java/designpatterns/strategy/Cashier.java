package com.study.java.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 上下文类
 */
public class Cashier {
    //会员，策略对象
    private Buyer buyer;

    public Cashier(Buyer buyer) {
        this.buyer = buyer;
    }

    public BigDecimal quote(BigDecimal orderPrice) {
        return buyer.calPrice(orderPrice);
    }
}
