package com.sheng.spring.service.impl;

import com.sheng.spring.service.HelloService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Service
@Scope("prototype")
public class UseHelloService {

    HelloService helloService;

    public void sayHello() {
        helloService.sayHello("sheng");
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
