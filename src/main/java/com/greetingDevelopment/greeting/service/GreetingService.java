package com.greetingDevelopment.greeting.service;

import com.greetingDevelopment.greeting.entity.Greeting;
import com.greetingDevelopment.greeting.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GreetingService {
    Greeting addGreeting(User user);
    Greeting fetchDataById(Long id);

    List<Greeting> getAllList();
    Greeting updateGreeting(Long id,User user);
}
