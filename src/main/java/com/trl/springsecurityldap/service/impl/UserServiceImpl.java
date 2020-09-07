package com.trl.springsecurityldap.service.impl;

import com.trl.springsecurityldap.controller.dto.UserDTO;
import com.trl.springsecurityldap.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO getUser(Long id) {
        return null;
    }
}
