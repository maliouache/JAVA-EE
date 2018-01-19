package com.journaldev.struts2.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;


import org.apache.struts2.interceptor.SessionAware;

import com.projetjee.pojos.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<User>{

	private static final long serialVersionUID = -3369875299120377549L;
	
	@Override
	public String execute() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/javaEE", "root", "mercilam");
        try {
        	 
            try {
                Statement st = con.createStatement();
                ResultSet value = st
                        .executeQuery("SELECT * FROM USER WHERE email='"+user.getEmail()+"';");
                if (value.next()){
                	String pass=value.getString("password");
                	if (pass.equals(user.getPassword())){
                		user.setUserName(value.getString("nom")+" "+value.getString("prenom"));
                		user.setNationalite(value.getString("nationalite"));
                		user.setNom(value.getString("nom"));
                		user.setPrenom(value.getString("prenom"));
                		user.setSexe(value.getString("sexe"));
                		user.setTypeUser(value.getString("type"));
            			sessionAttributes.put("USER", user);
            			return SUCCESS;
                	}
                	return INPUT;
                }
                else{
                	return INPUT;
                }
            } catch (SQLException ex) {
                System.out.println("SQL statement is not executed!" + ex);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return INPUT;
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
