package cn.xj.controller;

import cn.xj.pojo.AdminPw;
import cn.xj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class loginAction {
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String login(String name, String pwd, HttpServletRequest request) {
        System.out.println(name + " " + pwd);
            AdminPw adminPw = loginService.adminLogin(name, pwd);

            if (adminPw != null) {
                //登录成功
                request.setAttribute("admin", adminPw);
                return "managermain";
            } else {
                //登录失败
                request.setAttribute("errmsg", "用户名或密码不正确");
                return "myLogin";
            }

    }

}
