package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther fanjie
 * @date 2022年07月12日2:40
 */
@RestController
public class Demo {
    @GetMapping("/hello")
    public String test(){
        return "hello world";
    }
}
