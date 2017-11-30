package com.sheng.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shengxingyue, created on 2017/11/30
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
