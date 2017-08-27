package com.example.arahansa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jarvis on 2017. 8. 27..
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String getMapping(){
        return "hello world";
    }
}
