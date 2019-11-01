package com.example.testingStub.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.testingStub.entity.User;
import com.example.testingStub.repository.UserRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.example.testingStub.AppConfig.class})
@ActiveProfiles("development")
public class UserService {

	private UserRepository userRepository;
	private List<User> userList;

	
	public UserService() {
		super();
	}
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
		userList = userRepository.getUserList();
	}
	
	@Test
	public void testFindPositive() {
		assertNotNull(userList.get(0));
	}
	
	@Test(expected = java.lang.IndexOutOfBoundsException.class)
	public void testErrorThrown() {
		userList.remove(99);
	}
	
	@Test
	public void testContainsPositive() {
		assertEquals("juan", "juan");
	}
	
	@Test
	public void testContainsNegative() {
		assertNotEquals("juan", "fulanito");
	}
	
}
