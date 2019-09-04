package com.ron.message.model;

import java.util.Date;
import java.util.List;

public class UserRegistration {
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private List<String> progLang;
	private String favouriteSports;
	private String gender;
	private Date dateOfBirth;

	public String getFavouriteSports() {
		return favouriteSports;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setFavouriteSports(String favouriteSports) {
		this.favouriteSports = favouriteSports;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getProgLang() {
		return progLang;
	}

	public void setProgLang(List<String> progLang) {
		this.progLang = progLang;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + age + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
