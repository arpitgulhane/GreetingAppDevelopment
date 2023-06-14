package com.greetingDevelopment.greeting.service;

import com.greetingDevelopment.greeting.entity.Greeting;
import com.greetingDevelopment.greeting.entity.User;
import com.greetingDevelopment.greeting.reopositery.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImp implements GreetingService{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;


    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.getFirstName()+" "+user.getLastName());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }
}
