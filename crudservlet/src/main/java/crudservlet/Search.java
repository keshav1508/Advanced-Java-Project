package crudservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

public class Search extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	
	PrintWriter out=resp.getWriter();
	
	String name=req.getParameter("uname");
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/yo","root","mysql");
		
		
		PreparedStatement ps=conn.prepareStatement("select * from userlogin where name=?");
		
		
		ps.setString(1, name);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			out.print("name: "+rs.getString(1));
			out.print("password: "+rs.getString(2));
			out.print("email: "+rs.getString(3));
			out.print("Country: "+rs.getString(4));
		}
		
	} catch (Exception e) {
		   e.printStackTrace();
	}
	
	out.close();
}
}
