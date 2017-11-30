package com.sheng.spring.condition;

/**
 * @author shengxingyue, created on 2017/11/30
 */
public class MacBean implements ListCmd{

    @Override
    public String listCmd() {
        return "ls";
    }
}
