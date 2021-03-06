package com.stackroute.buzzup.controller;

import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.buzzup.exceptions.PasswordNotMatchException;
import com.stackroute.buzzup.exceptions.UserNameNotFoundException;
import com.stackroute.buzzup.exceptions.UserNameOrPasswordOrRoleEmpty;
import com.stackroute.buzzup.kafka.domain.Token;
import com.stackroute.buzzup.kafka.domain.User;
import com.stackroute.buzzup.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	/*@RequestMapping(value = "/register", method = RequestMethod.POST)
	public User registerUser(@RequestBody User user) {

		return userService.save(user);
	}*/

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody User login) throws ServletException {

		String jwtToken = "";
		try {
			if (login.getEmail() == null || login.getPassword() == null) {
				throw new UserNameOrPasswordOrRoleEmpty("Please fill in username and password");
			}
		} catch (UserNameOrPasswordOrRoleEmpty e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.CONFLICT);
		}

		String email = login.getEmail();
		String password = login.getPassword();
		//String role = login.getRole();

		User user = userService.findByEmailId(email);

		try {
			if (user == null) {
				throw new UserNameNotFoundException("User email not found.");
			}
		} catch (UserNameNotFoundException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.CONFLICT);
		}

		String pwd = user.getPassword();

		try {
			if (!password.equals(pwd)) {
				throw new PasswordNotMatchException("Invalid login. Please check your name and password.");
			}
		} catch (PasswordNotMatchException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.CONFLICT);
		}
		/*String roles = user.getRole();
		if (!role.equals(roles)) {
			throw new ServletException("Invalid login. Please check your name and passwordand role");
		}*/

		jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		Token t = new Token();
		t.setToken(jwtToken);
		return new ResponseEntity<>(t, HttpStatus.CREATED);
	}
}
