package com.greetingDevelopment.greeting.service;

import com.greetingDevelopment.greeting.entity.Greeting;
import com.greetingDevelopment.greeting.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface GreetingService {
    Greeting addGreeting(User user);
    Greeting fetchDataById(Long id);

}
