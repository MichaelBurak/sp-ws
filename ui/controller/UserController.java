package com.example.spws.ui.controller;
import org.springframework.web.bind.annotation.*;


//registers as REST controller
@RestController
//maps paths with prefix 'users' -> ex: /users/methodfoo
@RequestMapping("users")

public class UserController {

    //binds to HTTP request for METHOD OF REQUEST mapping
    @GetMapping
    public String getUser(){
        return "getUser called";
    }

    @PostMapping
    public String createUser(){
        return "createUser called";
    }

    @PutMapping
    public String updateUser(){
        return "updateUser called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "deleteUser called";
    }
}
