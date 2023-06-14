package com.springbootmicroservices.report.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/reports")
public class ReportController {
    @GetMapping()
    public ResponseEntity<?> signUpUser(){
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
