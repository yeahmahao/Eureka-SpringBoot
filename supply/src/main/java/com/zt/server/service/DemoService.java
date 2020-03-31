package com.zt.server.service;

import java.io.IOException;

import com.zt.server.model.Demo;

public interface DemoService{
    public abstract Demo[] getDemos() throws IOException;
}