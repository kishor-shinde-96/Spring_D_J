package com.jenkin_doker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainMethod {

    @GetMapping("/getResponse")
    public String getResponse(){
        return "hello Austere";
    }
    
}
