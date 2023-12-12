package com.educiupi.educiupiapp;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

record Person(String name, double savings) {}

record Greeting(String message,
                List<String> programmingLanguages,
                Person person) {}

@SpringBootApplication
@RestController
public class EduCiupiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduCiupiApplication.class, args);
    }

    @GetMapping("/greeting")
    public Greeting hello() {
        return new Greeting("Hello World!",
                List.of("Java", "Kotlin", "Scala"),
                new Person("Eduardo", 30_000));
    }
}
