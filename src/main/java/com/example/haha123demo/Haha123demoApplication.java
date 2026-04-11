package com.example.haha123demo;

import com.example.haha123demo.jpaImpl.MyJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Haha123demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Haha123demoApplication.class, args);
	}


	@Autowired
	MyJpa myJpa;

	@GetMapping("haha123")
	public String haha() {
		System.out.println("123");
		return "haha20230610"+myJpa.findById(1).get().name;
	}
}
