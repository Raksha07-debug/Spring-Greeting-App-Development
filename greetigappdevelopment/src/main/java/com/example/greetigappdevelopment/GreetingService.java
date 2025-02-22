package com.example.greetigappdevelopment;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingMessage() {
        return "Hello, World!";
    }
}
