package com.example.haha123demo.jpaImpl;

import com.example.haha123demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface MyJpa extends JpaRepository<User,Integer> {
}
