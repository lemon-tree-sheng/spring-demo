package com.sheng.spring.service.impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Service
public class UseHelloService {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void taskOne() {
        System.out.println("每隔5秒执行一次,现在时间：" + DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "0 20 11 ? * *")
    public void taskTwo() {
        System.out.println("11点18执行一次,现在时间：" + DATE_FORMAT.format(new Date()));
    }
}
