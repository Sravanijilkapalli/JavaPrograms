package com.test.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	System.out.println("Login - Start()");
	
	//Read input Data.
	String username = request.getParameter("username"); 
	String password = request.getParameter("password");
	
	System.out.println("Method" + request.getMethod());
	System.out.println("User Name" + username);
	System.out.println("Password" + password);
	
	
	//Logic
	
	if(username.equals("user123") && password.equals("122345")) {
		
		//logic sucess
		response.getWriter().println("Welcome to Home Page");
	}else {
		
		//failure
		response.getWriter().println("Username and password or incorrect...... please try again later.......");
	}
	
	System.out.println("Login - End()");
}
       
    
	
}
