package com.ishop.ishoptech.controllers.user;

import com.ishop.ishoptech.models.user.User;
import com.ishop.ishoptech.security.jwt.provider.JwtTokenProvider;
import com.ishop.ishoptech.security.user.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final JwtTokenProvider jwtTokenProvider;
    private final UserServiceImpl userService;

    @Autowired
    public UserController(JwtTokenProvider jwtTokenProvider, UserServiceImpl userService) {
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }

    @GetMapping("/token/{token}")
    public User getByToken(@PathVariable String token) {
        return userService.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(token)));
    }

}
