package com.study.java.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 普通会员
 */
public class CommonBuyer implements Buyer {
    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        //普通会员打9折
        return orderPrice.multiply(BigDecimal.valueOf(0.9));
    }
}
