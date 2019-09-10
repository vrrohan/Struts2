package com.ron.message.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ron.message.model.Person;

public class PersonAction extends ActionSupport implements ModelDriven<Person> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Person personBean = new Person();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (personBean.getFirstName().trim().length() < 2) {
			addFieldError("firstName", "FirstName length must be greater than or equal to 2");
		}

		if (personBean.getLastName().trim().length() < 4) {
			addFieldError("lastName", "LastName length must be greater than or equal to 4");
		}

		if (personBean.getEmail().trim().length() < 5) {
			addFieldError("email", "Please fill valid email address");
		}

		if (personBean.getAge() < 18) {
			addFieldError("age", "Age must be greater than or equal to 18");
		}
	}

	@Override
	public Person getModel() {
		// TODO Auto-generated method stub
		return personBean;
	}

}
