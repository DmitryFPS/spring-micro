package ru.orlov.micro.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String number;

    @GetMapping("/test")
    public String test() {
        return number;
    }
}