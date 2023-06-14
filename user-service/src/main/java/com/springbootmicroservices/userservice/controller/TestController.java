package com.springbootmicroservices.userservice.controller;

import com.springbootmicroservices.userservice.dto.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users/test")
@RequiredArgsConstructor
public class TestController {
    @GetMapping
    public String signUpUser(){
        return "test";
    }
}
