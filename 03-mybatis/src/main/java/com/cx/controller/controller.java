package com.cx.controller;

import com.cx.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    userservice userservice;

    @GetMapping("/getuser")
    public Object getuser() {
        return userservice.getuser();
    }
}
