package com.example.htmlex.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArnoldController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    //Exercise 2
    @GetMapping("/ex2")
    public String ex2(){
        return "ex2";
    }

    //Boxes ex
    @GetMapping("/box")
    public String box(){
        return "boxes";
    }
}
