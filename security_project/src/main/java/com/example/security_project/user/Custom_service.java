package com.example.security_project.user;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Custom_service implements UserDetailsService {

    private final User_interface userInterface;

    public Custom_service(User_interface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user user = userInterface.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found "));

        return org.springframework.security.core.userdetails.User
                .builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .authorities(user.getRole())
                .build();

    }
}
