package com.wyc.service;


/**
 * @author haima
 */
public interface UserService {
    boolean verifyUser(String username, String password);

    String registerUser(String username, String password);
}
