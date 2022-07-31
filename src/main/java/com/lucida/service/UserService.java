package com.lucida.service;

import com.lucida.model.User;
import com.lucida.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
