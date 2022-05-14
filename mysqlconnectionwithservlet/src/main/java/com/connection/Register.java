package com.connection;

import java.io.IOException;
import java.io.*;

import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Register extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	String name=req.getParameter("name");
	String password=req.getParameter("password");
	String emailid=req.getParameter("email");
	String country=req.getParameter("country");
	  try{

          Class.forName("com.mysql.jdbc.Driver");

          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/yo","root","mysql");               

          PreparedStatement ps=con.prepareStatement("insert into userlogin values(?,?,?,?)");

		  ps.setString(1,name);
		  ps.setString(2,password);
	      ps.setString(3,emailid);
	      ps.setString(4,country);
		  int i=ps.executeUpdate();
		  if(i>0)
		  {
		out.print("<h1>Data inserted successfully<h1>");
		  }
}catch(Exception e)
	  {
	System.out.print(e);
}
}
}
