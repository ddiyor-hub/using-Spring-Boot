package com.diyor.secure.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/")
    public String test(HttpServletRequest request) {
        return "Testing project" + " " + request.getSession().getId();
    }

}
