package com.study.springcloud.eurekafeign.feign;

import org.springframework.stereotype.Component;

/**
 * @author baode
 */
@Component
public class SchedualServiceHiHystric implements EurekaFeign {
    @Override
    public String feignClient(String name) {
        return "sorry " + name;
    }
}
