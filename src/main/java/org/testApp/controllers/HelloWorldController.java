package org.testApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
   @RequestMapping("/h")
    public String sayHello(){
        return "index";
    }
}


