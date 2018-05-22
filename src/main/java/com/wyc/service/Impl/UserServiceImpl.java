package com.wyc.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.wyc.mapper.UserMapper;
import com.wyc.model.User;
import com.wyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public boolean verifyUser(String username, String password) {
        List<User> users = userMapper.findByName(username);
        if (users.isEmpty()) {
            return false;
        }
        for (User user : users) {
            if(password.equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }

    public String registerUser(String username, String password2) {
        JSONObject jsonResult=new JSONObject();
        if (userMapper.findByName(username).isEmpty()) {
            userMapper.insertUser(username, password2);
            jsonResult.put("code","1");
            jsonResult.put("msg",username + "注册成功");
            return jsonResult.toJSONString();
        } else {
            jsonResult.put("code","0");
            jsonResult.put("msg",username + "注册失败，用户名已存在");
            return jsonResult.toJSONString();
        }

    }
}
