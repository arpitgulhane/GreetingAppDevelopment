package com.greetingDevelopment.greeting.controller;

import com.greetingDevelopment.greeting.entity.Greeting;
import com.greetingDevelopment.greeting.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Greetingcontroller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestBody User user){

        return new Greeting(counter.incrementAndGet(),String.format(user.getFirstName(),user.getLastName()));

    }

}
