package com.colin.controller;

import com.colin.bean.User;
import com.colin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: DengLong
 * Date: 2020-07-16
 * Time: 19:06
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/insertUser")
    public String insertUser() {
        return "insertUser";
    }

    @RequestMapping("/doInsertUser")
    public String doInsertUser(User user) {
        userService.insertUser(user);
        return "insertSuccess";
    }
}
