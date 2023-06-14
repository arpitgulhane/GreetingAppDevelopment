package com.greetingDevelopment.greeting.controller;

import com.greetingDevelopment.greeting.entity.Greeting;
import com.greetingDevelopment.greeting.entity.User;
import com.greetingDevelopment.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Greetingcontroller {
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam (defaultValue = "word")String firstName ,String lastName ){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/fetchById")
    public  Greeting fetchData(@PathVariable Long id){
        return greetingService.fetchDataById(id);
    }

    @GetMapping("/fetchAllData")
    public List<Greeting> getAllList(){
        return greetingService.getAllList();
    }

    @PutMapping("/update/{id}")
    public Greeting updateGreeting(@PathVariable("id") Long id, @RequestBody User user) {
        return greetingService.updateGreeting(id, user);
    }

    public String deleteById(@PathVariable("id")Long id ){
        greetingService.deleteById(id);
        System.out.println("Deleted ...");
        return "Deleted ...";
    }


}
