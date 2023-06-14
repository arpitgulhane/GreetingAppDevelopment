package com.greetingDevelopment.greeting.reopositery;

import com.greetingDevelopment.greeting.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> {

}
