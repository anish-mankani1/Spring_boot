package com.example.security_project.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class user_store_database {

private final User_interface userInterface;
private final PasswordEncoder passwordEncoder;

public user_store_database(User_interface userInterface ,PasswordEncoder passwordEncoder)
{
    this.userInterface=userInterface;
    this.passwordEncoder=passwordEncoder;
}

public user register(user user)
{
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    user.setRole("ROLE_USER");
     return userInterface.save(user);
}


}
