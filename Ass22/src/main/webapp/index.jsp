<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Random" %>    
<%@page errorPage="error.jsp" %>    
<%@page isErrorPage="false" %>  
<%@page session="false" %>  
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
<style>
section {
  display: -webkit-flex;
  display: flex;
}
article {
  -webkit-flex: 3;
  -ms-flex: 3;
  flex: 3;
  background-color: #f1f1f1;
  padding: 10px;
}
</style>
</head>

<body>
<!-- Scriplet tag:Java Code -->
<%
         Random rand=new Random();
         int rnum=rand.nextInt(10);
%>
<section> 
  <article>
    <h1 style="text-align:center;font-size:35px"">Hello...I am doing Assignment 2</h1>
    <!-- JSP Declaration Tags -->
    <p><%!
  int a=7;
  int b=2;
  
  public int dosub(){
	  return a-b;
  }
%>
<!-- Expression Tags -->
</p>
    <p style="text-align:center;font-size:30px"><%="Random number=>"+rnum %></p>
    <p  style="text-align:center;font-size:30px""><%="Subtraction of numbers=>"+a+"&"+b %></p>
       <p  style="text-align:center;font-size:30px""><% out.println("Subtraction is:"+dosub());%></p>
  </article>
</section>







</body>
</html>
<%@include file="footer.jsp" %>