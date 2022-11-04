package cn.xj.service.impl;

import cn.xj.mapper.AdminPwMapper;
import cn.xj.pojo.AdminPw;
import cn.xj.pojo.AdminPwExample;
import cn.xj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    AdminPwMapper adminPwMapper;

    @Override
    public AdminPw adminLogin(String name, String pwd) {
        AdminPwExample example = new AdminPwExample();
        //添加用户名a_name条件
        example.createCriteria().andAidEqualTo(name);
        List<AdminPw> list  = adminPwMapper.selectByExample(example);
        if(list.size() > 0){
            AdminPw adminPw = list.get(0);
            //如果查询到用户对象，再进行密码比对,注意密码是密文
            if(pwd.equals(adminPw.getApw())){
                return adminPw;
            }
        }
        return null;
    }
}
