package com.ron.message.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.ron.message.model.Person;

public class PersonAction extends ActionSupport {

	/**
	 * 
	 */
	private static Logger personLogger = Logger.getLogger(PersonAction.class.getName());
	private static final long serialVersionUID = 1L;
	private Person personBean;

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		personLogger.info("@@@===> execute() running from PersonAction class");
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (personBean.getFirstName().trim().length() < 2) {
			addFieldError("personBean.firstName", "FirstName length must be greater than or equal to 2");
		}

		if (personBean.getLastName().trim().length() < 4) {
			addFieldError("personBean.lastName", "LastName length must be greater than or equal to 4");
		}

		if (personBean.getEmail().trim().length() < 5) {
			addFieldError("personBean.email", "Please fill valid email address");
		}

		if (personBean.getAge() < 18) {
			addFieldError("personBean.age", "Age must be greater than or equal to 18");
		}
	}

}
