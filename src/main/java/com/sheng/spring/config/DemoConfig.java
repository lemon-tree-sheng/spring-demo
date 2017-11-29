package com.sheng.spring.config;

import com.sheng.spring.service.HelloService;
import com.sheng.spring.service.impl.HelloServiceImpl;
import com.sheng.spring.service.impl.NormalMethodService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Configuration
@ComponentScan(basePackages = "com.sheng.spring")
public class DemoConfig {

    /**
     * spring 方式指定生命周期方法
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public HelloService helloService() {
        return new HelloServiceImpl();
    }

    @Bean
    public NormalMethodService normalMethodService() {
        return new NormalMethodService();
    }
}
