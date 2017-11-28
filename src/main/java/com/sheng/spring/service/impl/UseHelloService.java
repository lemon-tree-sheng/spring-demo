package com.sheng.spring.service.impl;

import com.sheng.spring.service.HelloService;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class UseHelloService {

    HelloService helloService;

    public void sayHello() {
        helloService.sayHello("sheng");
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
