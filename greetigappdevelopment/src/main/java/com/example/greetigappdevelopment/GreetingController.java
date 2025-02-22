package com.example.greetigappdevelopment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello,World!";
    }
    @GetMapping("/service")
    public String sayHelloFromService(){
        return greetingService.getGreetingMessage();
    }
}
