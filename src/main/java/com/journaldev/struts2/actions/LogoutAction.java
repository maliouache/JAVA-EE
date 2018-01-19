package com.journaldev.struts2.actions;

import java.util.Map;


import org.apache.struts2.interceptor.SessionAware;

import com.projetjee.pojos.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LogoutAction extends ActionSupport implements SessionAware, ModelDriven<User>{

	private static final long serialVersionUID = -3369875299120377549L;
	
	@Override
	public String execute() throws Exception{
		sessionAttributes.clear();
		return SUCCESS;
	}
	
	private User user = new User();
	private Map<String, Object> sessionAttributes = null;

	public void setSession(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}
	
	public User getModel() {
		return user;
	}
	
}
