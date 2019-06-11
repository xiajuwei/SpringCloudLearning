package com.study.java.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 抽象策略类
 */
public interface Buyer {
    //计算应付价格
    BigDecimal calPrice(BigDecimal orderPrice);
}
