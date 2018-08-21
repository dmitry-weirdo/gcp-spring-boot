package de.actumdigital.gcpspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "hello world from Spring Rest Controller!";
    }

    @GetMapping("/hello")
    public String hello2() {
        return "hello world from Spring Rest Controller 2!";
    }
}