package com.sheng.spring;

import com.sheng.spring.config.DemoConfig;
import com.sheng.spring.service.impl.UseHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author shengxingyue, created on 2017/11/30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DemoConfig.class})
@ActiveProfiles("pro")
public class DemoTest {

    @Autowired
    UseHelloService useHelloService;

    @Test
    public void testUseHelloService() {
        useHelloService.sayHello();
    }
}
