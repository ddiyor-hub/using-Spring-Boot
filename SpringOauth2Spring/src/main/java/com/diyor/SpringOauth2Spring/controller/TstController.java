package com.diyor.SpringOauth2Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TstController {
    @GetMapping("/test")
    public String test() {
      return   "Testing controller";
    }

}
