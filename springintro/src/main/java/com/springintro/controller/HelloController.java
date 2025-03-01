package com.springintro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloController {
    @GetMapping(value = {"", "/", "/home"})
    public String restController(){
        return "Hello from BridgeLabz";
    }
}
