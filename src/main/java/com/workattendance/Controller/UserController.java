package com.workattendance.Controller;

import com.workattendance.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UserController {

    private UserService userService;

    //登录
    @GetMapping("/login/{empNo,password}")
    Boolean login(@PathVariable String empNo, String password) {
        return userService.Login(empNo,password);
    }
}