package com.ron.custom.interceptor;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class UsernameToUppercase implements Interceptor {

	/**
	 * 
	 */
	private static Logger myUppercaseNameLogger = Logger.getLogger(UsernameToUppercase.class.getName());
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		myUppercaseNameLogger.info("@@@===> destroy() from UsernameToUppercase class called.");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		myUppercaseNameLogger.info("@@@===> init() from UsernameToUppercase class called.");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		myUppercaseNameLogger.info("@@@===> intercept() from UsernameToUppercase class called.");
		ValueStack stack = ai.getStack();
		String personFirstname = stack.findString("personBean.firstName");
		String personLastname = stack.findString("personBean.lastName");
		stack.setValue("personBean.firstName", personFirstname.toUpperCase());
		stack.setValue("personBean.lastName", personLastname.toUpperCase());
		return ai.invoke();
	}

}
