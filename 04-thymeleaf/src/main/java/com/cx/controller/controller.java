package com.cx.controller;

import com.cx.bean.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class controller {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("world", "world");
        return "index";
    }

    @GetMapping("/getuser")
    public String getuser(Model model) {
        user user = new user(1, "cx", 23, 300000);
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping("/getfun")
    public String getfun(Model model) {
        model.addAttribute("page", 3);
        model.addAttribute("total", 4);
        model.addAttribute("sex", 0);
        model.addAttribute("curdate", new Date());
        return "fun";
    }

    @GetMapping("/getcollection")
    public String getcoll(Model model) {
        List<user> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new user(i,"cx"+i,23+i,i*100000+100000));
        }
        model.addAttribute("list",list);
        return "collection";
    }
}
