package com.stackroute.buzzup.recommendationservice.services;

import java.util.List;

import com.stackroute.buzzup.kafka.domain.InputUser;



public interface UserService {

	public void getUserNode(InputUser user);

}
