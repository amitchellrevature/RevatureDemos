package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
		response.setContentType("text/html; charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<HTML>");
			out.println("<Head>");
			out.println("<Title>Servlet State Managment</Title>");
			out.println("</Head>");
			out.println("<Body>");
			
			String name  =request.getParameter("name");
			out.println("<h1>Hello, "+ name +" welcome to my website..</h1>");
			out.println("<h1><a href='servlet2'>Go to servlet 2</a></h1>");
			
			
			// create a cookie
			Cookie c = new Cookie("user_name", name);
			response.addCookie(c);
			
			
			out.println("</Body>");
			out.println("</Html>");
		}

	}

}
