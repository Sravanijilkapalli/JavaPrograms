package com.test.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServelet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Login - Start()");
		
		//Read Input Data
		String step1 = request.getParameter("input1"); 
		String step2 = request.getParameter("input2");
		int result;
		int num1 = 0;
		int num2 = 0;
		try {
			
			 num1 = Integer.parseInt(step1);
			 num2 = Integer.parseInt(step2);
			
		}catch(NumberFormatException e) {
			request.setAttribute("errormsg", "kindly enter only numeric values");
			RequestDispatcher rd = request.getRequestDispatcher("/addnums.jsp");
			rd.forward(request, response);

			
		}
		
		
		 result = num1+num2;
		request.setAttribute("answer", result);
		RequestDispatcher rd = request.getRequestDispatcher("/addresult.jsp");
		rd.forward(request, response);

		System.out.println("Login - End()");
	}

	
}
