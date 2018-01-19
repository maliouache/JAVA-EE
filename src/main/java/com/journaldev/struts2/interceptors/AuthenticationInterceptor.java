package com.journaldev.struts2.interceptors;

import java.util.ArrayList;
import java.util.Map;

import com.projetjee.pojos.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthenticationInterceptor implements Interceptor {

	private static final long serialVersionUID = -5011962009065225959L;
	private ArrayList<String> tour=new ArrayList<String>();
	public void destroy() {
		//release resources here
	}

	public void init() {
		// create resources here
	}

	public String intercept(ActionInvocation actionInvocation)
			throws Exception {
		System.out.println("intercepting ...");
		Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();

		User user = (User) sessionAttributes.get("USER");
		if(user == null){
			System.out.println("No user connected!! redirecting...");
			return Action.LOGIN;
		}else{
			System.out.println("user connected!! checking for authorisation...");
		tour.add("unMonumentd");
		tour.add("home");
		tour.add("logout");
		tour.add("mapMonuments");
		tour.add("listMonuments");
		String myInterceptedAction=actionInvocation.getProxy().getActionName();
		
		if (user.getTypeUser().equals("touriste")){
			if (!tour.contains(myInterceptedAction)){
				System.out.println("Access denied.");
				return "forbidden";
			}
		}
		System.out.println("Access granted.");		
			
		Action action = (Action) actionInvocation.getAction();
		if(action instanceof UserAware){
			((UserAware) action).setUser(user);
		}
		return actionInvocation.invoke();
		}
	}

}
