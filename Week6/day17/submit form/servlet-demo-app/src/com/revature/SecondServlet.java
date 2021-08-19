package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service called....");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello from Servlet - Second</h1>");
		out.print("</body></html>");
		
	}

}
