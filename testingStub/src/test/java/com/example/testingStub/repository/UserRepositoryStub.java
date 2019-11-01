package com.example.testingStub.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.testingStub.entity.User;

@Repository
public class UserRepositoryStub implements UserRepository {

	private List<User> userList = new ArrayList<>();

	public List<User> getUserList() {
		userList.add(new User("juan"));
		userList.add(new User("perico"));
		userList.add(new User("andrés"));
		return userList;
	}

}
