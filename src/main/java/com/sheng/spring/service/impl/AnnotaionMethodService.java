package com.sheng.spring.service.impl;

import com.sheng.spring.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Service
public class AnnotaionMethodService {

    @Action(name = "注解切点")
    public void add() {
        System.out.println("执行加法逻辑");
    }
}
