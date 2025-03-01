package com.springintro.controller;

import com.springintro.controller.dtu.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HelloController {
    //localhost:8080/home
    @GetMapping(value = {"", "/", "/home"})
    public String restController(){
        return "Hello from BridgeLabz";
    }

    // used request mapping to get the query in the form of name then it will be displayed
    //localhost:8080/home/query
    @RequestMapping(value = "/query")
    public String queryController(@RequestParam(value = "name") String name){
        return "Hello " + name + " !";
    }

    //used params to take input and display it .
    //localhost:8080/home/param/Baibhavi
    @GetMapping("/param/{name}")
    public String paramController(@PathVariable(value = "name") String name){
        return "Hello " + name + " !";
    }

    // displaying users first name and last name with RequestBody and PostMapping
    //localhost:8080/home/post
    @PostMapping("/post")
    public String postController(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }

    // displaying users first name and last name with PutMapping
    //    http://localhost:8080/home/put/Baibhavi?LastName=Pandey
    @PutMapping("/put/{firstName}")
    public String putController(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName + " !";
    }
}
