package com.longpc.democicdjenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {
    @GetMapping
    public ResponseEntity getHelloworld(){
        return ResponseEntity.ok("hello-world");
    }
}
