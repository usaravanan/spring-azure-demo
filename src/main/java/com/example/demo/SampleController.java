package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/")
    public ResponseEntity pingMe() {
        return new ResponseEntity<>("{\"message\":\"pinged successfully\"}", HttpStatus.OK);
    }
}
