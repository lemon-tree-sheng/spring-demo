package com.sheng.spring.service.impl;

import com.sheng.spring.service.HelloService;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        System.out.println("hello," + name);
    }
}
