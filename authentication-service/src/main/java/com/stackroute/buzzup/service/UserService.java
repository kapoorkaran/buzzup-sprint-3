package com.stackroute.buzzup.service;

import com.stackroute.buzzup.kafka.domain.InputUser;
import com.stackroute.buzzup.kafka.domain.User;

public interface UserService {
	
	User save(User user);

	
	User findByEmailId(String email);


	public void consumeKafka(InputUser User);

}
