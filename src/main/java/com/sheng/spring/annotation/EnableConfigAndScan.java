package com.sheng.spring.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shengxingyue, created on 2017/11/30
 * 自定义组合注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan
@Configuration
public @interface EnableConfigAndScan {
    /**
     * 按返回类型和默认值覆盖掉 @ComponentScan 里面的 value
     * @return
     */
    String[] value() default {};
}
