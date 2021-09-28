package com.dj.pms.service;

public interface SystemService {
    void msg(Integer level, String msg);

    void info(String msg);
    void warn(String msg);
    void error(String msg);
}
