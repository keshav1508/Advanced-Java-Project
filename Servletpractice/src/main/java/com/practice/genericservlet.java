package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class genericservlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	   res.setContentType("text/html");
	   PrintWriter out=res.getWriter();
	   out.print("<h1>This is generic servlet</h1>");
		
	}	
}
