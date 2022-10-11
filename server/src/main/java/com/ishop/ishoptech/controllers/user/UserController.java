package com.ishop.ishoptech.controllers.user;

import com.ishop.ishoptech.models.user.User;
import com.ishop.ishoptech.security.jwt.provider.JwtTokenProvider;
import com.ishop.ishoptech.security.user.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserServiceImpl userService;

    private final UserServiceImpl userServiceImpl;

    @Autowired
    public UserController(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, UserServiceImpl userService, UserServiceImpl userServiceImpl) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/token/{token}")
    public User getByToken(@PathVariable String token) {
        return userService.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(token)));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user) {
        try {
            String username = user.getUsername();
            String password = user.getPassword();
            User newUser = this.userServiceImpl.register(user);

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            String token = jwtTokenProvider.createToken(username, Set.copyOf(newUser.getRoles()));

            Map<Object, Object> response = new HashMap<>();
            response.put("user", newUser);
            response.put("token", token);
            response.put("roles", newUser.getRoles());

            return ResponseEntity.ok(response);
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

}
