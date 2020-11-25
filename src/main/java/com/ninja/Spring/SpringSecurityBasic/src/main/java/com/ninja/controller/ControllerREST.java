package com.ninja.controller;

import com.ninja.models.Dog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerREST {

    @RequestMapping("/REST")
    public String index() {
        return "Hello REST";
    }

    @RequestMapping("/REST/DOG")
    public String dog() {
        return new Dog("Coyote", 3, "Steve").toString();
    }
}
