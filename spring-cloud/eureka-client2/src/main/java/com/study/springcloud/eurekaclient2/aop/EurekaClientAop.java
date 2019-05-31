package com.study.springcloud.eurekaclient2.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class EurekaClientAop {
    /**
     * service 下所有方法拦截
     */
    @Pointcut("execution(* com.study.springcloud.eurekaclient2.service..*.*(..))")
    public void clientAop() {
    }

    @Before("clientAop()")
    public void before() {
        log.info("进入方法前拦截");

    }

//    @Around("clientAop()")
//    public void round() {
//
//        log.info("方法前后拦截");
//    }


    @After("clientAop()")
    public void after() {

        log.info("方法后拦截");

    }

    @AfterReturning("clientAop()")
    public void afterTeturn(){

        log.info("方法返回值后拦截");

    }


}
