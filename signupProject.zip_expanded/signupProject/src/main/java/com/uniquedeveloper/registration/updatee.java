package com.uniquedeveloper.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updatee
 */
@WebServlet("/updatee")
public class updatee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     
		
		
		
		
		
		String uname=request.getParameter("name");
		String uemail=request.getParameter("email");
		String upwd=request.getParameter("pass");
		String umobile=request.getParameter("contact");
	RequestDispatcher dispatcher=null;
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup?useSSL=false","root","mysql");
	    	PreparedStatement pst=con.prepareStatement("update users set uname = ?,upwd= ?, uemail =?, umobile =? where uemail  = ?;");
	    	pst.setString(1, uname);
	    	pst.setString(2, upwd);
	    	pst.setString(3, uemail);
	    	pst.setString(4, umobile);
			pst.executeUpdate();
	    	
	    	int rowCount=pst.executeUpdate();
	    	
	    	dispatcher=request.getRequestDispatcher("index.jsp");
	    	if(rowCount>0)
	    	{
	    		request.setAttribute("status", "success");
	    	}
	    	
	    	else {
	    		request.setAttribute("status", "failed");
	    	}
	    	dispatcher.forward(request, response);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    finally {
	    	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  	    }
	    }
}

