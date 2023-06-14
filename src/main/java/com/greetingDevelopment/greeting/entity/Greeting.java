package com.greetingDevelopment.greeting.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@Entity
@Data
//@NoArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "Greetings")
@AllArgsConstructor
public class Greeting {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
    private Long id;

    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Greeting(long incrementAndGet, String format) {
        this.id=incrementAndGet;
        this.message=format;
    }
}
