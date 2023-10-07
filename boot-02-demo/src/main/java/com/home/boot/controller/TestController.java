package com.home.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {
    @Autowired
    private Date date;
    @RequestMapping("/hello")
    public String firstTest(){
        return "===欢迎使用SpringBoot3===" + date;
    }
}
