<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>This is my first MVC Program</h1>

<%   
   String uname=(String)request.getAttribute("username");
  
 %>
 <h1 style=" color:red">WELCOME <%=uname %></h1>
</body>
</html>