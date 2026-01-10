package com.ttn.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {
    @GetMapping("/how")
    public String hi(){
        return "how are you? bro?";
    }
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
