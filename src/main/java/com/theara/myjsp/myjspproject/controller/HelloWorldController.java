package com.theara.myjsp.myjspproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/hello")
    public String getGreeting(){
        return "hello";
    }
}
