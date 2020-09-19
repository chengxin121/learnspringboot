package com.cx.service;

import com.cx.bean.user;
import com.cx.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userserviceimpl implements userservice {
    @Autowired
    userMapper userMapper;

    @Override
    public List<user> getuser() {
        return userMapper.getuser();
    }
}
