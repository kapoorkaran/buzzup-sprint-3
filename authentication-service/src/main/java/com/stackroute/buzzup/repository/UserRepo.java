package com.stackroute.buzzup.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.buzzup.kafka.domain.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	User save(User user);

	User findByEmailId(String email);

	
}
