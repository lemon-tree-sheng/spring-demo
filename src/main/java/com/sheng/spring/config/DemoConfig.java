package com.sheng.spring.config;

import com.sheng.spring.service.HelloService;
import com.sheng.spring.service.impl.HelloServiceImpl;
import com.sheng.spring.service.impl.UseHelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Configuration
@ComponentScan(basePackages = "com.sheng.spring")
public class DemoConfig {

    @Bean
    public HelloService getHelloService() {
        return new HelloServiceImpl();
    }

    @Bean
    public UseHelloService getUseHelloService() {
        UseHelloService useHelloService = new UseHelloService();
        useHelloService.setHelloService(getHelloService());
        return useHelloService;
    }

    /**
     * java config 方式配置，如果 bean容器已经有对应 bean，可以直接作为方法参数提供注入
     * ps:
     * 默认单例，需要注掉，不然会报下面的错
     * expected single matching bean but found 2
     * @param helloService
     * @return
     */
    /*@Bean
    public UseHelloService getUseHelloService2(HelloService helloService) {
        UseHelloService useHelloService = new UseHelloService();
        useHelloService.setHelloService(helloService);
        return useHelloService;
    }*/
}
