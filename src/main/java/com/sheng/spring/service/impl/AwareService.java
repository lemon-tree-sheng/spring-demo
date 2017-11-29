package com.sheng.spring.service.impl;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @author shengxingyue, created on 2017/11/29
 * spring aware 的简单使用
 * 实现xxxAware 接口，我们可以很容易拿到容器资源，并作为参数交给业务类来实现响应逻辑
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware{
    String name;
    ResourceLoader resourceLoader;

    /**
     * 拿到这个bean的名字
     * @param s
     */
    @Override
    public void setBeanName(String s) {
        this.name = s;
    }

    /**
     * 拿到资源加载器
     * @param resourceLoader
     */
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
