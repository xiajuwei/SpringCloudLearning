package com.study.springcloud.eurekafeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author baode
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface EurekaFeign {

    /**
     * feign 使用
     *
     * @param name
     * @return
     */
    @RequestMapping("/hi")
    String feignClient(@RequestParam("name") String name);

}
