package com.lucida.service;

import com.lucida.model.User;
import com.lucida.repository.UserRepository;
import com.lucida.web.dto.UserRegistrationDto;
import com.lucida.model.Role;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        Role role = new Role("ROLE_USER");
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(),
                registrationDto.getPassword(), role);
        return userRepository.save(user);
    }
}
