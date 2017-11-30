package com.sheng.spring.config;

import com.sheng.spring.annotation.EnableConfigAndScan;
import com.sheng.spring.condition.ListCmd;
import com.sheng.spring.condition.MacBean;
import com.sheng.spring.condition.MacCondition;
import com.sheng.spring.condition.WindowsBean;
import com.sheng.spring.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author shengxingyue, created on 2017/11/29
 *         利用spring 框架集成线程池来执行异步任务
 */
@EnableConfigAndScan("com.sheng.spring")
public class DemoConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListCmd windowsBean() {
        return new WindowsBean();
    }

    @Bean
    @Conditional(MacCondition.class)
    public ListCmd macBean() {
        return new MacBean();
    }
}
