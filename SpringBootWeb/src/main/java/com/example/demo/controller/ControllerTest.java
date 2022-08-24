package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yangwb
 * @Data 2022/8/24 23:29
 * @Version 1.0
 */
@RestController
public class ControllerTest {

    @GetMapping("/test")
    public String getTest(){
        return "Hello Test";
    }
}
