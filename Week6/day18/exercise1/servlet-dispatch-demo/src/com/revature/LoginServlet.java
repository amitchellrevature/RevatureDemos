package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter(); 
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			// when user enter correct details
			if(username.equals("admin") && password.equals("123")) {
				RequestDispatcher rd = request.getRequestDispatcher("welcomeservlet");
				rd.forward(request, response);
			}else {
				out.println("Sorry invalid username and password");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
		}
}
