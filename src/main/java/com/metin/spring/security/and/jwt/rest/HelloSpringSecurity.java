package com.metin.spring.security.and.jwt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringSecurity {

    @GetMapping("/hellospringsecurity")
    public String hellospringsecurity() {
        return "hellospringsecurity";
    }
}
