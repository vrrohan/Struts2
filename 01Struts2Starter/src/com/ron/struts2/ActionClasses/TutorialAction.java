package com.ron.struts2.ActionClasses;

public class TutorialAction {

	public String execute() {
		System.out.println("Hello from " + this.getClass().getName() + " class execute() method.");
		return "success";
	}
}
