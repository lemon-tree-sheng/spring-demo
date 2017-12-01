package com.sheng.spring.controller;

import com.sheng.spring.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author shengxingyue, created on 2017/12/1
 */
@Controller
public class NormalController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/normal")
    public ModelAndView page() {
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("msg", demoService.sayHello());
        return modelAndView;
    }
}
