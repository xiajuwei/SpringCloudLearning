package com.study.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baode
 */
@RestController
public class EurekaClientController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String client(@RequestParam String name) {


        return "hi " + name + " I is form " + port;
    }

}
