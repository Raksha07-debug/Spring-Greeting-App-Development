package com.example.greetigappdevelopment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello,World!";
    }
}
