package com.springbootmicroservices.management.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user_role")
@RequiredArgsConstructor
public class UserController {


    @GetMapping("/alladvertisements")
    public String getAllAdvertisements() {
        return "test";

    }

    @GetMapping("/advertisement/{advertisementId}")
    public ResponseEntity<?> getAdvertisementById(@PathVariable String advertisementId) {

        return ResponseEntity.ok("Advertisement Not Found");
    }

}
