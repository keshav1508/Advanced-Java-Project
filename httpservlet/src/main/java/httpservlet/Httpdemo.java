package httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Httpdemo extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	String str1=req.getParameter("n1");
	String str2=req.getParameter("n2");
	int num1=Integer.parseInt(str1);
	int num2=Integer.parseInt(str2);
	int result=num1+num2;
	out.print("<h1>Addition of two number=>"+result+"</h1>");
	out.close();
	super.doGet(req, resp);
}
}
