package com.ron.message.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ron.message.model.UserRegistration;

public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserRegistration registerUser;

	public UserRegistration getRegisterUser() {
		return registerUser;
	}

	public void setRegisterUser(UserRegistration registerUser) {
		this.registerUser = registerUser;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (registerUser.getFirstName().trim().length() < 2) {
			addFieldError("registerUser.firstName", "FirstName length must be greater than or equal to 2");
		}

		if (registerUser.getLastName().trim().length() < 4) {
			addFieldError("registerUser.lastName", "LastName length must be greater than or equal to 4");
		}

		if (registerUser.getEmail().trim().length() < 5) {
			addFieldError("registerUser.email", "Please fill valid email address");
		}

		if (registerUser.getAge() < 18) {
			addFieldError("registerUser.age", "Age must be greater than or equal to 18");
		}
	}

}
