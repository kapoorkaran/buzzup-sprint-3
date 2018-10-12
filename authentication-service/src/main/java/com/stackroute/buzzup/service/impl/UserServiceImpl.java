package com.stackroute.buzzup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.buzzup.kafka.domain.InputUser;
import com.stackroute.buzzup.kafka.domain.User;
import com.stackroute.buzzup.repository.UserRepo;
import com.stackroute.buzzup.service.UserService;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userDao;

	public User save(User user) {
		return userDao.save(user);
	}

	public User findByEmailId(String email) {
		return userDao.findByEmailId(email);
	}
	


	@Override
	@KafkaListener(topics = "details11", groupId = "userlogin")
	public void consumeKafka(InputUser inputUser) {

		User user = new User();

		if (userDao.findByEmailId(inputUser.getEmailId()) == null) {
			String email = inputUser.getEmailId();
			String password = inputUser.getPassword();
			String userName= inputUser.getUserName();
			user.setEmail(email);
			user.setPassword(password);
			user.setRole("user");
			user.setUserName(userName);
			userDao.save(user);

		}
	}

}
