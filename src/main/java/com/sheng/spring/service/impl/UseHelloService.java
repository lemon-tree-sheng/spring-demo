package com.sheng.spring.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Service
public class UseHelloService {
    private String name;

    public UseHelloService(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello ," + name);
    }
}
