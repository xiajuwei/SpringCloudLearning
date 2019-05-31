package com.study.springcloud.eurekaclient2.controller;

import com.study.springcloud.eurekaclient2.service.EurekaClientService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author baode
 */
@RestController
public class EurekaClientController {

    @Resource
    EurekaClientService eurekaClientService;

    @RequestMapping("/hi")
    public String client(@RequestParam String name) {

        return eurekaClientService.client(name);

    }

}
