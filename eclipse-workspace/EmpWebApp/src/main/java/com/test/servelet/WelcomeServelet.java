package com.test.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServelet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	System.out.println("Welcome Servelet--> service ()  ---started");	
	PrintWriter out = res.getWriter(); 
	out.println("<html><title>Show Time</title><body>");
	out.println("<h1>Date : "+ new Date());
	out.println("</h1></body></html>");
	System.out.println("Welcome Servelet---> service() ----ended");
	
	}
	

}
