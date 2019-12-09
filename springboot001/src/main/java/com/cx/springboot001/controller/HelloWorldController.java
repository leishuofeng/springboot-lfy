package com.cx.springboot001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/helloworld")
    public String helloWorld() {
        return "hello World";
    }

    @Value("${person.boss}")
    private boolean isBoss;

    @Value("${test.name}")
    private String testName;


    @RequestMapping(value = "/profile")
    public Boolean testProfile() {
        return isBoss;
    }

    @RequestMapping(value = "/test")
    public String testName(){
        return testName;
    }
}
