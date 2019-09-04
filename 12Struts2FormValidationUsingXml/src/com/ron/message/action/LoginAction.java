package com.ron.message.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.ron.message.model.Person;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Person personLogin;
	private static Logger logger = Logger.getLogger(LoginAction.class.getName());

	public Person getPersonLogin() {
		return personLogin;
	}

	public void setPersonLogin(Person personLogin) {
		this.personLogin = personLogin;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		logger.info("execute() enters...");
		if (personLogin.getUserId().trim().equals("admin") && personLogin.getPassword().trim().equals("admin123")) {
			return "success";
		}
		return "failure";
	}

}
