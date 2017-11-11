package com.longshare.login_demo.service;

import com.longshare.login_demo.dao.UserDao;
import com.longshare.login_demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public String add(User user){
        if(userDao.selectOneUser(user.getUsername())==null){
             userDao.add(user);
             return "注册成功";
        }else
            return "该用户名已被注册";
    }

    //验证用户登陆密码
    public String login(User user){
        User dbUser = userDao.selectOneUser(user.getUsername());
            if(dbUser!=null){
                if(!dbUser.getPassword().equals(user.getPassword())){
                    return "密码错误";
                }
                else
                    System.out.println(dbUser.getPassword());
                return "登陆成功";
        }else
            return "无此人";

    }

}
