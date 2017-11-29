package com.sheng.spring.Event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Component
public class DemoEventListener implements ApplicationListener<DemoEvent>{
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("DemoEventListener 监听到 DemoEvent 事件");
    }
}
