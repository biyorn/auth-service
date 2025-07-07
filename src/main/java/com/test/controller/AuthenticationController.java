package com.test.controller;

import com.test.dto.UserEntityDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {


    @PostMapping("/sign-up")
    public ResponseEntity<UserEntityDTO> signUp(@RequestBody UserEntityDTO userEntityDTO) {
        return ResponseEntity.ok(new UserEntityDTO());
    }
}
