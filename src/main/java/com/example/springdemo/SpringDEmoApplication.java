package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hi")
public class SpringDEmoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDEmoApplication.class, args);
    }
@GetMapping(value = "get")
    public  static String cal(){

        return "hi this is murad";

    }
}
