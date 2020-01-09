package com.adalitek.mph.service;


import org.springframework.stereotype.Service;

import com.adalitek.mph.model.User;

public interface UserService {

    public User findUserByEmail(String email) ;
    public User saveUser(User user);
}
