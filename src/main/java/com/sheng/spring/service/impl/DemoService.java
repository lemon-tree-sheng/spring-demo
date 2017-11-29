package com.sheng.spring.service.impl;

import com.sheng.spring.config.DemoConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class DemoService {

    public static void main(String[] args) {
        /**
         * 正常调用
         */
        ApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
        NormalMethodService normalMethodService = ac.getBean(NormalMethodService.class);
        normalMethodService.add();

        AnnotaionMethodService annotaionMethodService = ac.getBean(AnnotaionMethodService.class);
        annotaionMethodService.add();

    }
}
