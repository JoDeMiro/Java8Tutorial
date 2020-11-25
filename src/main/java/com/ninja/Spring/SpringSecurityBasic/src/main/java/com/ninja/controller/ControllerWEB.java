package com.ninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWEB {

    @GetMapping("/")
    public String root() {
        return "Default";
    }

    @GetMapping("/default")
    public String index() {
        return "Default";
    }

}
