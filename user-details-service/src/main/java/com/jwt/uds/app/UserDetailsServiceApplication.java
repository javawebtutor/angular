package com.jwt.uds.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jwt.uds.app.entity.User;
import com.jwt.uds.app.repo.UserRepository;

@SpringBootApplication
public class UserDetailsServiceApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Mukesh", "Kumar"));
		userRepository.save(new User("Ravi", "Raj"));
		userRepository.save(new User("Amit", "Raj"));

	}
}
