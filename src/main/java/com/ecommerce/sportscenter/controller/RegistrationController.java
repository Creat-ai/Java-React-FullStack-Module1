package com.ecommerce.sportscenter.controller;

import com.ecommerce.sportscenter.entity.User;
import com.ecommerce.sportscenter.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class RegistrationController {
    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User newUser  = userService.registerUser (user.getUsername(), user.getPassword(), user.getEmail());
        return ResponseEntity.ok(newUser );
    }
}