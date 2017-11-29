package com.sheng.spring.Event;

import org.springframework.context.ApplicationEvent;

/**
 * @author shengxingyue, created on 2017/11/29
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
