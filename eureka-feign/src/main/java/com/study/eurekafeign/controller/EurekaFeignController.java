package com.study.eurekafeign.controller;

import com.study.eurekafeign.feign.EurekaFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaFeignController {
    @Autowired
    EurekaFeign eurekaFeign;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name) {

        return eurekaFeign.feignClient(name);
    }

}
