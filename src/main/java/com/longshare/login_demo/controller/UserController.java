package com.longshare.login_demo.controller;

import com.longshare.login_demo.entity.User;
import com.longshare.login_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //主页面
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    //登陆界面
    @RequestMapping("/loginForm")
    public String loginForm(){
        return "login";
    }
    //注册界面
    @RequestMapping(value="/registerForm",method = RequestMethod.GET)
    public String registerForm(){
        return "register";
    }

    //
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String register(Model model,
                           @ModelAttribute(value = "user") User user,
                           HttpServletResponse response){
        String result = userService.add(user);
       model.addAttribute("result",result);
        return response.encodeRedirectURL("/index");
    }
    @RequestMapping(value = "/login1", method = RequestMethod.POST)
    public String login(
            Model model,
            @ModelAttribute(value = "user")User user,
            HttpServletResponse response,
            HttpSession session){
        String str=userService.login(user);
        if(str.equals("登陆成功")){
            session.setAttribute("user",user);
            model.addAttribute("str",str);
            return  response.encodeRedirectURL("/success");
        }else
            return "login";
    }
    @RequestMapping(value = "loginOut",method = RequestMethod.GET)
    public String loginOut(HttpSession session){

        session.removeAttribute("user");
        return "login";
    }

}
