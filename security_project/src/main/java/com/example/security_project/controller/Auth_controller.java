package com.example.security_project.controller;

import com.example.security_project.config.Jwtutil;
import com.example.security_project.user.Custom_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class Auth_controller {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private Custom_service customService;

    @Autowired
    private Jwtutil jwtutil;

    @PostMapping()
    public String login(@RequestBody Auth_request request) {

        // Authenticate username & password
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        // Load user
        UserDetails userDetails = customService.loadUserByUsername(request.getUsername());

        // Generate JWT token
        return jwtutil.generateToken(userDetails.getUsername());
    }
}
