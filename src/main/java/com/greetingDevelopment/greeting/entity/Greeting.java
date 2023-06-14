package com.greetingDevelopment.greeting.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
//@AllArgsConstructor
//@Entity
@Data
//@NoArgsConstructor

public class Greeting {
    @Id
    private Long id;
    private String message;

    public Greeting(long incrementAndGet, String format) {
        this.id=incrementAndGet;
        this.message=format;
    }
}
