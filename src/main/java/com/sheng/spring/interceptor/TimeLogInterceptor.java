package com.sheng.spring.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shengxingyue, created on 2017/11/30
 * 自定义拦截器
 */
public class TimeLogInterceptor extends HandlerInterceptorAdapter {
    private static ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Long now = System.currentTimeMillis();
        System.out.println("方法开始执行时间：" + now);
        startTime.set(now);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Long now = System.currentTimeMillis();
        System.out.println("方法结束执行时间：" + now);
        Long start = startTime.get();
        System.out.println("共耗时：" + (now - start));
        super.postHandle(request, response, handler, modelAndView);
    }
}
