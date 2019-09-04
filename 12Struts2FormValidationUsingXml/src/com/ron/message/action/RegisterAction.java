package com.ron.message.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ron.message.model.UserRegistration;

public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserRegistration registerUser;
	private List<String> favouriteSports = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("Football");
			add("Cricket");
			add("Swimming");
			add("Baseball");
		}
	};
	private List<String> userGender = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("Male");
			add("Female");
			add("Not Specified");
		}
	};
	private List<String> programmingLanguages = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("C++");
			add("Html");
			add("Java");
			add("Javascript");
			add("Python");
			add("Ruby");
		}
	};
	private Date dateOfBirth;

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDefaultGenderValue() {
		return userGender.get(0).toString();
	}

	public String getDefaultFavouriteSports() {
		return favouriteSports.get(0).toString();
	}

	public String getDefaultProgrammingLanguage() {
		return "";
	}

	public boolean getAgeAbove18() {
		return true;
	}

	public UserRegistration getRegisterUser() {
		return registerUser;
	}

	public void setRegisterUser(UserRegistration registerUser) {
		this.registerUser = registerUser;
	}

	public List<String> getFavouriteSports() {
		return favouriteSports;
	}

	public void setFavouriteSports(List<String> favouriteSports) {
		this.favouriteSports = favouriteSports;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		registerUser.setProgLang(getProgrammingLanguages());
		registerUser.setFavouriteSports(getFavouriteSports().get(0));
		registerUser.setGender(getUserGender().get(0));
		registerUser.setDateOfBirth(getDateOfBirth());
		return SUCCESS;
	}

	/*
	 * @Override public void validate() { // TODO Auto-generated method stub if
	 * (registerUser.getFirstName().trim().length() < 2) {
	 * addFieldError("registerUser.firstName",
	 * "FirstName length must be greater than or equal to 2"); }
	 * 
	 * if (registerUser.getLastName().trim().length() < 4) {
	 * addFieldError("registerUser.lastName",
	 * "LastName length must be greater than or equal to 4"); }
	 * 
	 * if (registerUser.getEmail().trim().length() < 5) {
	 * addFieldError("registerUser.email", "Please fill valid email address"); }
	 * 
	 * if (registerUser.getAge() < 18) { addFieldError("registerUser.age",
	 * "Age must be greater than or equal to 18"); } }
	 */

	public List<String> getUserGender() {
		return userGender;
	}

	public void setUserGender(List<String> userGender) {
		this.userGender = userGender;
	}

	public List<String> getProgrammingLanguages() {
		return programmingLanguages;
	}

	public void setProgrammingLanguages(List<String> programmingLanguages) {
		this.programmingLanguages = programmingLanguages;
	}

}
