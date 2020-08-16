package com.redtravel.controller;

import com.redtravel.bean.Msg;
import com.redtravel.bean.User;
import com.redtravel.service.UserService;
import com.redtravel.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.DocFlavor;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    //用户注册
    @ResponseBody
    @RequestMapping("/userregister")
    public Msg register(User user) {
//        String code = RandomUtils.createActive();
//        System.out.println(code);
        System.out.println(user);
        userService.userregister(user);
        return Msg.success();
    }

    //用户登录
    @ResponseBody
    @RequestMapping("/userlogin")
    public Msg login(String usertelephone, String userpassword) {
        System.out.println(userpassword);
        System.out.println(usertelephone);
        if (usertelephone != null && userpassword != null) {
            User user = userService.getUserByPhone(usertelephone);
            System.out.println(user);
            if (user != null) {
                if (user.getUserpassword().equals(userpassword)) {
                    System.out.println("密码正确");

                    return Msg.success();
                } else {
                    System.out.println("输入正确的用户名或密码");

                    return Msg.fail().add("info","输入正确的用户名或密码");
                }
            }
        }
        System.out.println("输入正确的用户名或密码");
        return Msg.fail().add("info","输入正确的用户名或密码");

    }
}
