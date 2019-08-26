package com.ron.message.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ron.message.model.MessageStore;

public class StoreAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		messageStore = new MessageStore();
		return "success";
	}

	public MessageStore getMessage() {
		return messageStore;
	}

}
