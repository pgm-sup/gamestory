package com.wyc.controller;

import com.alibaba.fastjson.JSONObject;
import com.wyc.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author haima
 */
@CrossOrigin
@Controller
@RequestMapping(value = "/user")
public class LoginController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    String userLogin(@RequestParam("username")String username, @RequestParam("password")String password) {
        String verify = userService.verifyUser(username, password);
        return verify;
    }


    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("username")String username, @RequestParam("password")String password) {
        return userService.registerUser(username, password);
    }
}

