package com.example.hw12.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestControler {
    @GetMapping("/test")
    public String testMethod() {
        return "test";
    }
}
