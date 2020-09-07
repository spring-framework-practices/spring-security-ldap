package com.trl.springsecurityldap.service;

import com.trl.springsecurityldap.controller.dto.UserDTO;

public interface UserService {

    UserDTO getUser(Long id);
}
