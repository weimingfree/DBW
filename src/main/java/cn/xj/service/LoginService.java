package cn.xj.service;

import cn.xj.pojo.AdminPw;

public interface LoginService {
    AdminPw adminLogin(String name, String pwd);
}
