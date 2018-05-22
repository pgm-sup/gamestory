package com.wyc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.alibaba.fastjson.JSONObject;
import com.wyc.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wyc.model.User;
import com.wyc.result.Result;
import com.wyc.result.ResultFactory;

import java.util.Objects;

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
    boolean userLogin(@Param("username")String username, @Param("password")String password) {
        System.out.println(username);
        System.out.println(password);
        boolean verify = userService.verifyUser(username, password);
        return verify;
    }

    //注册方法
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Param("username")String username, @Param("password")String password, @Param("password2")String password2) {
        JSONObject jsonResult=new JSONObject();
        if (password.equals(password2)) {
            return userService.registerUser(username, password2);
        }
        jsonResult.put("code","0");
        jsonResult.put("msg","请输入密码一致");
        return jsonResult.toJSONString();
    }
}

