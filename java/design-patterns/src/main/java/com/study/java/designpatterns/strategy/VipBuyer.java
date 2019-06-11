package com.study.java.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 具体策略类
 * <p>
 * 专属会员
 */
public class VipBuyer implements Buyer {
    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        //会员打7折

        return orderPrice.multiply(BigDecimal.valueOf(0.7));
    }
}



