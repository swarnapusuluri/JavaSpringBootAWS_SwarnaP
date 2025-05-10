package com.example.swarnaAWS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

    @GetMapping("/getName")
    public String printName(){
        return "Hello Swarna!!! Welcomeeeeee Swarna";

    }
}
