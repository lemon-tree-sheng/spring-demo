package com.sheng.spring.controller;

import com.sheng.spring.bean.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @RequestMapping("/advice")
    public void advice(DemoObj demoObj, @ModelAttribute("msg") String msg) {
        throw new IllegalArgumentException("参数异常,@ModelAttribute:" + msg);
    }
}
