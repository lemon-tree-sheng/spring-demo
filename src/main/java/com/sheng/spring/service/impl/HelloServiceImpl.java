package com.sheng.spring.service.impl;

import com.sheng.spring.service.HelloService;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class HelloServiceImpl implements HelloService {

    private String name;

    public HelloServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello," + this.name);
    }

}
