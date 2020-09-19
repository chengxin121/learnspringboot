package com.cx.service;

import com.cx.bean.mgr;

public interface service {
    void addmgr(mgr mgr);

    mgr foundmgr(mgr mgr);

    mgr foundid(String id);
}
