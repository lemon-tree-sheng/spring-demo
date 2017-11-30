package com.sheng.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author shengxingyue, created on 2017/11/29
 *         利用spring 框架集成线程池来执行异步任务
 */
@Configuration
@ComponentScan(basePackages = "com.sheng.spring")
@EnableScheduling
public class DemoConfig {

}
