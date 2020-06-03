package com.tianci.gmall.user.service.impl;

import com.tianci.gmall.user.bean.UserMember;
import com.tianci.gmall.user.mapper.UserMapper;
import com.tianci.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserMember> getAllUser() {
        return userMapper.getAllUser();
    }
}
