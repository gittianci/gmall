package com.tianci.gmall.user.controller;

import com.tianci.gmall.user.bean.UserMember;
import com.tianci.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        return "hello user";
    }

    @RequestMapping("/user")
    @ResponseBody
    public List<UserMember> getAllUser(){
        return userService.getAllUser();
    }

}
