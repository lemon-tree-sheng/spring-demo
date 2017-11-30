package com.sheng.spring.condition;

/**
 * @author shengxingyue, created on 2017/11/30
 */
public class WindowsBean implements ListCmd{

    @Override
    public String listCmd() {
        return "dir";
    }
}
