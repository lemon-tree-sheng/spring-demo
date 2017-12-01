package com.sheng.spring.controller;

import com.sheng.spring.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shengxingyue, created on 2017/12/1
 */
@RestController
public class TestRestController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/rest", produces = "text/plain;charset=UTF-8")
    public String hello() {
        return demoService.sayHello();
    }
}
