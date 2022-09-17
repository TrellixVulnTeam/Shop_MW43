package com.ishop.ishoptech.controllers;

import com.ishop.ishoptech.models.user.User;
import com.ishop.ishoptech.security.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/admin/")
public class AdminRestController {

    private final UserService userService;

    @Autowired
    public AdminRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public ResponseEntity homeTest(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<String> getUserById(@PathVariable Long id){
        User result = userService.findById(id);

        if(result == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>("works", HttpStatus.OK);
    }

}
