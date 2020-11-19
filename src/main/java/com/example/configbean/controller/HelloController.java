package com.example.configbean.controller;

import com.example.configbean.service.FunctionService;
import com.example.configbean.service.NadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    FunctionService functionService;

    @Autowired
    NadaService nadaService;

    @PostMapping("hello")
    public String hello(){
        return "hello  word";
    }

    @GetMapping("hello1")
    public String hello1(String word){
        System.out.println(nadaService.sayHoall());
        return functionService.sayHello(word);
    }
}
