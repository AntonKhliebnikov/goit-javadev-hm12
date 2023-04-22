package com.example.hw12.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControler {
    @GetMapping("/test")
    @ResponseBody
    public String testMethod() {
        return "Hello from TestController!";
    }
}
