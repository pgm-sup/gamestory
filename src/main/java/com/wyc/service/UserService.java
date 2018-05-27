package com.wyc.service;


/**
 * @author haima
 */
public interface UserService {
    String verifyUser(String username, String password);

    String registerUser(String username, String password);
}
