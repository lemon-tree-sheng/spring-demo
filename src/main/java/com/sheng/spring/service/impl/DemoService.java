package com.sheng.spring.service.impl;

import com.sheng.spring.config.DemoConfig;
import com.sheng.spring.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class DemoService {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
        HelloService helloService = ac.getBean(HelloService.class);
        HelloService helloService2 = ac.getBean(HelloService.class);
        Assert.isTrue(helloService == helloService2);

        UseHelloService useHelloService = ac.getBean(UseHelloService.class);
        UseHelloService useHelloService2 = ac.getBean(UseHelloService.class);
        Assert.isTrue(useHelloService != useHelloService2);
    }
}
