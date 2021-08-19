package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Servlet6 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		HttpSession session = request.getSession(false);
		String name =  (String)session.getAttribute("uname");
		
		// getting the value from query string
		
		out.print("Welcome "+ name);
		out.close();
	}
}