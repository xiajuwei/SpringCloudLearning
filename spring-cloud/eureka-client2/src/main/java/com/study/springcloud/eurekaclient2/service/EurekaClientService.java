package com.study.springcloud.eurekaclient2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EurekaClientService {
    @Value("${server.port}")
    private String port;


    public String client(String name){

        return "hi " + name + " I is form " + port;

    }

}
