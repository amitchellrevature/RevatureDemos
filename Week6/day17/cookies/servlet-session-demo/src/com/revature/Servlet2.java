package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.sql.rowset.serial.SerialException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
		response.setContentType("text/html; charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<HTML>");
			out.println("<Head>");
			out.println("<Title>Servlet State Managment</Title>");
			out.println("</Head>");
			out.println("<Body>");
			
			
			// get cookies
			Cookie[] cookies = request.getCookies();
			boolean flag = false;
			String name = "";
			if(cookies == null) {
				out.println("<h1>you are new user go to home page and submit your name</h1>");
				return;
			}else {
				for(Cookie c : cookies) {
					String tname =  c.getName();
					if(tname.equals("user_name")){
						flag = true;
						name = c.getValue();
					}
				}
			}
			
			if(flag) {
				out.println("<h1>Hello, "+ name +" welcome back to my website..</h1>");	
			}
			
			
			out.println("</Body>");
			out.println("</Html>");
		}

	}

}
