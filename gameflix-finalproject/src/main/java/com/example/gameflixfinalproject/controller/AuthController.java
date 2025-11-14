package com.example.gameflixfinalproject.controller;

import com.example.gameflixfinalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Map<String, String> registerUser(@RequestBody Map<String, String> userData) {
        String username = userData.get("username");
        String password = userData.get("password");

        String message = userService.registerUser(username, password);
        return Map.of("message", message);
    }

    @PostMapping("/login")
    public Map<String, String> loginUser(@RequestBody Map<String, String> userData) {
        String username = userData.get("username");
        String password = userData.get("password");

        String message = userService.loginUser(username, password);
        return Map.of("message", message);
    }
}
