package com.lucida.web.dto;

import com.lucida.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")

public class UserRegistrationController {

    private UserService userService;


    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto ) {
        userService.save(registrationDto);
        return "redirect://registartion?success";

    }
}
