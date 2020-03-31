package com.zt.server.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

import com.zt.server.model.Demo;

@Service
public class DemoServiceIml implements DemoService {
    @Value("${param.p1}")
    private String p1;

    @Override
    public Demo[] getDemos() throws IOException {
        Demo[] ret = new Demo[3];
        ret[0] = new Demo(p1);
        ret[1] = new Demo("xxx");
        return ret;
    }

}