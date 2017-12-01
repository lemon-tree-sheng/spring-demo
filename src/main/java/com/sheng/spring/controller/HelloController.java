package com.sheng.spring.controller;

import com.sheng.spring.bean.DemoObj;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author shengxingyue, created on 2017/11/30
 */
@Controller
public class HelloController {

    @RequestMapping("/advice")
    public void advice(DemoObj demoObj, @ModelAttribute("msg") String msg) {
        throw new IllegalArgumentException("参数异常,@ModelAttribute:" + msg);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        FileUtils.writeByteArrayToFile(new File("~/sheng/spring-demon/" + file.getOriginalFilename()), file.getBytes());
        return "ok";
    }
}
