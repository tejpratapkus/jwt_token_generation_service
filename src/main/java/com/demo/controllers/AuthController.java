package com.demo.controllers;

import com.demo.models.UserRequest;
import com.demo.models.UserResponse;
import com.demo.service.JwtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtService service;

    @Autowired
    private AuthenticationManager authenticationManager;

    private Logger logger = LoggerFactory.getLogger(AuthController.class);


    @PostMapping("/api/v1/login")
    public UserResponse authenticateAndGenerateToken(@RequestBody UserRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        if (authentication.isAuthenticated()) {
            return UserResponse.builder().username(request.getUsername())
                    .accessToken(service.GenerateToken(request.getUsername())).build();
        } else {
            throw new UsernameNotFoundException("invalid user request..!!");
        }
    }


    @GetMapping("/ping")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String test() {
        try {
            return "Welcome";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}