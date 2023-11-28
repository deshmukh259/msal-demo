package com.msal.msaldemo.controller;


import com.msal.msaldemo.dao.model.Userr;
import com.msal.msaldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {


    @Autowired
    private UserService userService;
    
    @GetMapping( "user/{id}")
    public ResponseEntity<Userr> getUser(@PathVariable("id") int id){
        System.out.println("get user "+id);
     return ResponseEntity.of(Optional.of(userService.getUser(id)));

    } @PostMapping( "user")
    public ResponseEntity<Userr> getUser(@RequestBody Userr userr){
        System.out.println("add user "+userr);
     return ResponseEntity.of(Optional.of(userService.addUser(userr)));

    }
}
