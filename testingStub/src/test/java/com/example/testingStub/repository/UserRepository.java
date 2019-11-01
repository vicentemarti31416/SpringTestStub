package com.example.testingStub.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.testingStub.entity.User;

public interface UserRepository {

	List<User> getUserList();
}
