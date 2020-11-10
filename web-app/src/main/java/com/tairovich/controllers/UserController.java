package com.tairovich.controllers;

import com.tairovich.User;
import com.tairovich.domain.UserCommand;
import com.tairovich.mappers.UserMapper;

public class UserController {

    public User saveUser(UserCommand command){
        //fake impl
        return UserMapper.INSTANCE.userCommandtoUser(command);
    }

}
