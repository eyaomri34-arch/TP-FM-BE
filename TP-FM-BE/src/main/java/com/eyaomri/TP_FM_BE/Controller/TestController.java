package com.eyaomri.TP_FM_BE.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public String sayHello() {
        return "Spring Boot is working successfully with Security!";
    }
}