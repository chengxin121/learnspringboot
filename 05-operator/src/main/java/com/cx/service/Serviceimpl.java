package com.cx.service;

import com.cx.bean.mgr;
import com.cx.mapper.mgrmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serviceimpl implements service {

    @Autowired
    mgrmapper mgrmapper;

    @Override
    public void addmgr(mgr mgr) {
        mgrmapper.addmgr(mgr);
    }

    @Override
    public mgr foundmgr(mgr mgr) {
        return mgrmapper.foundmgr(mgr);
    }

    @Override
    public mgr foundid(String id) {
        return mgrmapper.foundid(id);
    }
}
