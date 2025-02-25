package com.example.greetigappdevelopment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/personalised")
    public String personalisedGreeting(@RequestParam(required = false) String firstName,@RequestParam(required = false) String lastName) {
        return greetingService.getPersonalisedGreeting(firstName, lastName);
    }
    @PostMapping("/save")
    public Greeting saveGreeting(@RequestBody Greeting greeting) {
        return greetingService.saveGreeting(greeting);
    }
}
