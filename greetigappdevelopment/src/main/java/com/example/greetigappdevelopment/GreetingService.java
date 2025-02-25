package com.example.greetigappdevelopment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

 @Autowired(required = true)
    private GreetingRepository greetingRepository;
    public String getGreetingMessage() {
        return "Hello, World!";
    }
    public String getPersonalisedGreeting(String firstName,String lastName){
        if(firstName!=null && lastName!=null){
            return "Hello"+firstName+" "+lastName+"!";
        } else if (firstName!=null) {
            return "Hello,"+firstName+"!";
        } else if (lastName!=null) {
            return "Hello, "+lastName+ "!";
        }
        else{
            return "Hello, World !";
        }
    }
    public Greeting saveGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

}
