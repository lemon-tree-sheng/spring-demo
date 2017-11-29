package com.sheng.spring.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class NormalMethodService {

    public void add() {
        System.out.println("执行加法逻辑");
    }

    /**
     * java ee 规范指定生命周期方法
     */
    @PostConstruct
    public void init() {
        System.out.println("bean 初始化");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("bean 销毁");
    }
}
