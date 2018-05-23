package com.wyc.controller;

import com.alibaba.fastjson.JSONObject;
import com.wyc.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author haima
 */
@Controller
@RequestMapping(value = "/user")
public class LoginController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    boolean userLogin(@RequestParam("username")String username, @RequestParam("password")String password) {
        System.out.println(username);
        System.out.println(password);
        boolean verify = userService.verifyUser(username, password);
        return verify;
    }


    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("username")String username, @RequestParam("password")String password, @RequestParam("password2")String password2) {
        JSONObject jsonResult=new JSONObject();
        if (password.equals(password2)) {
            return userService.registerUser(username, password2);
        }
        jsonResult.put("code","0");
        jsonResult.put("msg","请输入密码一致");
        return jsonResult.toJSONString();
    }
}

