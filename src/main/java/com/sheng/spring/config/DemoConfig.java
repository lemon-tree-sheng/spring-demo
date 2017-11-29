package com.sheng.spring.config;

import com.sheng.spring.service.HelloService;
import com.sheng.spring.service.impl.HelloServiceImpl;
import com.sheng.spring.service.impl.NormalMethodService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Configuration
@ComponentScan(basePackages = "com.sheng.spring")
public class DemoConfig {

    @Bean
    @Profile("dev")
    public HelloService helloService() {
        return new HelloServiceImpl("dev");
    }

    @Bean
    @Profile("prod")
    public HelloService helloService2() {
        return new HelloServiceImpl("prod");
    }
}
