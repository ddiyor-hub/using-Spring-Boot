package com.webproject.App.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/d2")
    @ResponseBody
    public String hello() {
        return "Hello////////////////////dsfdsfdsfdsfds";
    }
}
