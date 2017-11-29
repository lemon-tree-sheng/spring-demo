package com.sheng.spring.service.impl;

import com.sheng.spring.config.DemoConfig;
import org.apache.commons.io.IOUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class DemoService {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
        AwareService awareService = ac.getBean(AwareService.class);

        System.out.println(awareService.name);
        ResourceLoader resourceLoader = awareService.resourceLoader;
        try {
            Resource resource = resourceLoader.getResource("classpath:test.txt");
            System.out.println(IOUtils.toString(resource.getInputStream()));
        } catch (Exception e) {

        }
    }
}
