package com.thevarungupta;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServlet implements Servlet{

	ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("creating object...");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("servicing  ...");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("going to destroy servle object...");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "this servlet created by admin";
	}

	

	

}
