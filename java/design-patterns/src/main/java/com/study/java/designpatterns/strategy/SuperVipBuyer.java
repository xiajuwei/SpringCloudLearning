package com.study.java.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 具体策略类
 * <p>
 * 超级会员
 */
public class SuperVipBuyer implements Buyer {
    //计算应付价格
    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        //超级会员打5折
        return orderPrice.multiply(BigDecimal.valueOf(0.5));
    }
}
