package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		System.out.println("this is get method of my servlet");
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.print("<h1>Get Method called</h1>");
//		out.print(new Date().toString());
//	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("this is post method of my servlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>post Method called</h1>");
		out.print(new Date().toString());
	}
}
