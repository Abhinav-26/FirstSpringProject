package com.example.FirstSpringProject.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {
    @GetMapping
    public String home(){
        return "application is up and running !!!"+ new Date();
    }

    @GetMapping(value = "/ping")
    public String ping(){
        return "application is up and running !!!"+ new Date();
    }
}
