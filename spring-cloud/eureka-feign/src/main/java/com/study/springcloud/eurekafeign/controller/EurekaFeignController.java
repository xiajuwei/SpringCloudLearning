package com.study.springcloud.eurekafeign.controller;

import com.study.springcloud.eurekafeign.feign.EurekaFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EurekaFeignController {
    @Resource
    EurekaFeign eurekaFeign;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name) {

        return eurekaFeign.feignClient(name);
    }

}
