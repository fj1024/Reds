package com.redtravel.service;

import com.redtravel.bean.User;
import com.redtravel.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    //用户注册
    public void userregister(User user) {
        userMapper.insertSelective(user);
    }
    //获取用户信息
    public User getUserByPhone(String usertelephone) {
        return userMapper.selectByPhone(usertelephone);
    }
}
