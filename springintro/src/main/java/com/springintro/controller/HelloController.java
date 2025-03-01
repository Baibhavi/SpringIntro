package com.springintro.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HelloController {
    @GetMapping(value = {"", "/", "/home"})
    public String restController(){
        return "Hello from BridgeLabz";
    }

    // used request mapping to get the query in the form of name then it will be displayed
    @RequestMapping(value = "/query")
    public String queryController(@RequestParam(value = "name") String name){
        return "Hello " + name + " !";
    }

    //used params to take input and display it .
    @GetMapping("/param/{name}")
    public String paramController(@PathVariable(value = "name") String name){
        return "Hello " + name + " !";
    }
}
