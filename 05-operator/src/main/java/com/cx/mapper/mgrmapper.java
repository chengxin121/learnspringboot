package com.cx.mapper;

import com.cx.bean.mgr;

public interface mgrmapper {

    void addmgr(mgr mgr);

    mgr foundmgr(mgr mgr);

    mgr foundid(String id);
}
