package com.example.security_project.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class User_controller {
    private final Custom_service customService;
    private final user_store_database userStoreDatabase;

    public User_controller(Custom_service customService,user_store_database userStoreDatabase)
    {
        this.customService=customService;
        this.userStoreDatabase=userStoreDatabase;
    }

    @PostMapping("/register")
    public user register(@RequestBody  user user)
    {
        return userStoreDatabase.register(user);
    }
    @GetMapping
    public String run()
    {
        return "Successfully run";
    }
}
