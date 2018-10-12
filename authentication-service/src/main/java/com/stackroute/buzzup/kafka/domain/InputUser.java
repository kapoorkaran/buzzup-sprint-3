package com.stackroute.buzzup.kafka.domain;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

public class InputUser {
	
	private String userId;
	@Size(min = 6, max = 20)
	private String userName;
	@Id
	private String emailId;
	private double userMobile;
	@Size(min = 8, max = 20)
	private String password;
	private String userGender;
	private String age;
	private String[] movieGenre;
	private String city ;
	private String fburl;
	private String twitterurl;
	private String[] prefLang;
	private String[] eventCategory;

	public InputUser() {

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(double userMobile) {
		this.userMobile = userMobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String[] getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String[] movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFburl() {
		return fburl;
	}

	public void setFburl(String fburl) {
		this.fburl = fburl;
	}

	public String getTwitterurl() {
		return twitterurl;
	}

	public void setTwitterurl(String twitterurl) {
		this.twitterurl = twitterurl;
	}

	public String[] getPrefLang() {
		return prefLang;
	}

	public void setPrefLang(String[] prefLang) {
		this.prefLang = prefLang;
	}

	public String[] getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String[] eventCategory) {
		this.eventCategory = eventCategory;
	}

	public InputUser(String userId, @Size(min = 6, max = 20) String userName, String emailId, double userMobile,
			@Size(min = 8, max = 20) String password, String userGender, String age, String[] movieGenre, String city,
			String fburl, String twitterurl, String[] prefLang, String[] eventCategory) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.userMobile = userMobile;
		this.password = password;
		this.userGender = userGender;
		this.age = age;
		this.movieGenre = movieGenre;
		this.city = city;
		this.fburl = fburl;
		this.twitterurl = twitterurl;
		this.prefLang = prefLang;
		this.eventCategory = eventCategory;
	}


}
