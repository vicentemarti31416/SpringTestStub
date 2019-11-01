package com.example.testingStub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.testingStub.repository.UserRepository;
import com.example.testingStub.repository.UserRepositoryStub;
import com.example.testingStub.service.UserService;

@Configuration
public class AppConfig {

	@Bean
	public UserService userService() {
		return new UserService();
	}
	
	@Bean
	public UserRepository userRepository() {
		return new UserRepositoryStub();
	}
}
