package com.zt.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zt.server.service.DemoService;

import java.io.IOException;

import com.zt.server.model.Demo;

// allowCredentials必须加上
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@EnableEurekaClient
@RestController
public class DemoServiceController {
    @Autowired
    DemoService service;

    @RequestMapping(value = "/demos")
    public ResponseEntity<Object> getDemo() {
        try {
            Demo[] Demos = service.getDemos();
            return new ResponseEntity<>(Demos, HttpStatus.OK);
        } catch (IOException ex) {
            return new ResponseEntity<>(ex, HttpStatus.INSUFFICIENT_STORAGE);
        }
    }
}