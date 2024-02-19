package com.example.cicd.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
        @GetMapping()
        public String sayHello() {
            return "Hello, World!";
        }
}
