package com.cx.controller;

import com.cx.bean.mgr;
import com.cx.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    @Autowired
    service service;

    @GetMapping("/land")
    public String land() {
        return "land";
    }

    @PostMapping("/dologin")
    public String dologin(mgr mgr) {
        mgr m = service.foundmgr(mgr);
        if (m == null) {
            return "land";
        } else {
            return "function";
        }
    }

    @GetMapping("/foundid")
    @ResponseBody
    public String foundid(String id){
        System.out.println("hello");
        mgr mgr = service.foundid(id);
        if (mgr != null) {
            return "true";
        } else {
            return "";
        }
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/doregister")
    public String doregister(mgr mgr, String password2, Model model) {
        if (mgr.getPassword().equals(password2)) {
            service.addmgr(mgr);
            model.addAttribute("msg", "注册成功");
            return "register";
        } else {
            model.addAttribute("msg", "注册失败");
            return "register";
        }
    }
}
