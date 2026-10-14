package com.jsp.ai_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {

    @GetMapping(value = "/greetings")
    public String greet() {
        return "Hello from Ai_service Eureka client!";
    }

}