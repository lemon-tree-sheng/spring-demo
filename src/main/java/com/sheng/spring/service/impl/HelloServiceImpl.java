package com.sheng.spring.service.impl;

import com.sheng.spring.service.HelloService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Service
@Scope("singleton") // 默认值
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        System.out.println("hello," + name);
    }
}
