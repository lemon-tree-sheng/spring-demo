package com.sheng.spring.service.impl;

import com.sheng.spring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Service
public class UseHelloService {
    @Autowired
    HelloService helloService;

    public void sayHello() {
        helloService.sayHello("sheng");
    }
}
