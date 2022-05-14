<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%   
   String name=(String)request.getAttribute("n1");
   String email=(String)request.getAttribute("n2");
   String pwd=(String)request.getAttribute("n3");
 %>
 <h1 style=" color:red">WELCOME <%=name %></h1>
  <h1 style=" color:red">WELCOME <%=email %></h1>
   <h1 style=" color:red">WELCOME <%=pwd %></h1>
</body>
</html>