package com.xjtu.blog.controller;


import com.xjtu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("loginPage")
    String loginPage() {
        return "login";
    }

    @RequestMapping("registerPage")
    String registerPage() {
        return "register";
    }

    @RequestMapping("login")
    String login() {
        return "login";
    }


}
