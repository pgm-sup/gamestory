package com.wyc.service;


public interface UserService {
    boolean verifyUser(String username, String password);

    String registerUser(String username, String password2);
}
