package com.sheng.spring.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author shengxingyue, created on 2017/11/30
 * 统一 controller 处理
 */
@ControllerAdvice
public class ControllerConfig {

    /**
     * 统一异常处理
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView exception() {
        ModelAndView result = new ModelAndView("error");
        result.addObject("errorMessage", "错误信息");
        return result;
    }

    /**
     * 设置全局属性，可用于 http 请求上
     * @param model
     */
    @ModelAttribute
    public void modelAttribute(Model model) {
        model.addAttribute("msg", "附加信息");
    }

    /**
     * 设置全局绑定逻辑
     * @param webDataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        // 过滤请求中的 id 字段
        webDataBinder.setDisallowedFields("id");
    }
}
