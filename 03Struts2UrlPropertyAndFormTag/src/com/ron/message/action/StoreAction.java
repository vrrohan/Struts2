package com.ron.message.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ron.message.model.MessageStore;

public class StoreAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;
	private String userName;
	public static int count = 0;

	public int getCount() {
		return count;
	}

	public String getUserName() {
		return userName;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		messageStore = new MessageStore();
		count++;
		return "success";
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public MessageStore getMessage() {
		return messageStore;
	}

}
