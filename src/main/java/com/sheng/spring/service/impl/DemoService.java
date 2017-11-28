package com.sheng.spring.service.impl;

import com.sheng.spring.config.DemoConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class DemoService {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
        UseHelloService helloService = ac.getBean(UseHelloService.class);
        helloService.sayHello();
    }
}
