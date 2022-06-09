package com.myproject.music4u.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloMusic")
public class helloMusic {

    @GetMapping("/sayHello")
    public String hello(){
        System.out.println("hello");
        return "ok";
    }
}
