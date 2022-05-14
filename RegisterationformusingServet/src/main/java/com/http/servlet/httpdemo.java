package com.http.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class httpdemo extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	String str1=req.getParameter("username");
	String str2=req.getParameter("email");
	String str3=req.getParameter("password");
	out.print("<h1>Usernamer=>"+str1 +"</h1>");
	out.print("<h1>Emailr=>"+str2 +"</h1>");
	out.print("<h1>Password=>"+str3 +"</h1>");
	out.close();
	super.doGet(req, resp);
	
}
}
