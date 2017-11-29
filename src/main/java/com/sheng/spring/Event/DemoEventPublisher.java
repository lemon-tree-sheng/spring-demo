package com.sheng.spring.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Component
public class DemoEventPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publishDemoEvent() {
        System.out.println("发布 demoEvent 事件");
        applicationContext.publishEvent(new DemoEvent(this, "demo event"));
    }

}
