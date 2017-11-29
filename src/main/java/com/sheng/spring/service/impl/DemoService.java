package com.sheng.spring.service.impl;

import com.sheng.spring.config.DemoConfig;
import com.sheng.spring.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class DemoService {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

        ac.getEnvironment().setActiveProfiles("dev");
        ac.register(DemoConfig.class);
        ac.refresh();

        HelloService helloService = ac.getBean(HelloService.class);
        helloService.sayHello("sheng");
    }
}
