package com.sheng.spring.service.impl;

import com.sheng.spring.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Value("shengxingyue")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello," + name);
    }
}
