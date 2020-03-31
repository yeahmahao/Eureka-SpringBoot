package com.zt.server.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableEurekaClient
@Controller
public class ServerController{
    @RequestMapping(value = "/")
    public String getRoot(){
        return "/home.html";
    }
}