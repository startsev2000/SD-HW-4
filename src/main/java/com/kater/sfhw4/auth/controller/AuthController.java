package com.kater.sfhw4.auth.controller;// AuthController.java

import com.kater.sfhw4.auth.dto.UserLoginDto;
import com.kater.sfhw4.auth.model.Session;
import com.kater.sfhw4.auth.service.SessionService;
import com.kater.sfhw4.auth.service.UserService;
import com.kater.sfhw4.auth.dto.UserRegistrationDto;
import com.kater.sfhw4.auth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;
    private final SessionService sessionService;

    @Autowired
    public AuthController(UserService userService, SessionService sessionService) {
        this.userService = userService;
        this.sessionService = sessionService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegistrationDto registrationDto) {
        User user = userService.register(registrationDto);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLoginDto loginDto) {
        Session session = userService.login(loginDto);
        return ResponseEntity.ok(session.getSessionToken());
    }

    @GetMapping("/me")
    public ResponseEntity<?> me(@RequestHeader("Authorization") String sessionToken) {
        int id = sessionService.getUserBySessionToken(sessionToken);
        return ResponseEntity.ok(id);
    }
}
