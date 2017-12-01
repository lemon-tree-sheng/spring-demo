package com.sheng.spring.bean;

import java.io.Serializable;

/**
 * @author shengxingyue, created on 2017/12/1
 */
public class DemoObj implements Serializable{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
