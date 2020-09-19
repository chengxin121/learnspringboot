package com.cx.controller;

import com.cx.bean.school;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private school school;

    @GetMapping("/getschool")
    public String getschool() {
        System.out.println("你好");
        System.out.println(school);
        return "SUCCESS";
    }
}
