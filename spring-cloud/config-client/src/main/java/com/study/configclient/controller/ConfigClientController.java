package com.study.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${hello}")
    String hello;

    @RequestMapping(value = "/hi")
    public String hi() {
        return hello;
    }


}
