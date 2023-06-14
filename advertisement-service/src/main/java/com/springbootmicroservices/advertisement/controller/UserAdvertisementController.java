package com.springbootmicroservices.advertisement.controller;

import com.springbootmicroservices.advertisement.entity.Advertisement;
//import com.springbootmicroservices.advertisement.service.AdvertisementService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user_role")
@RequiredArgsConstructor
public class UserAdvertisementController {


    @GetMapping("/alladvertisements")
    public String test(){
    return "user_ ";
    }
}

