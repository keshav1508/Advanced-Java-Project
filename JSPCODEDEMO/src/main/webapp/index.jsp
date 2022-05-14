<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.Random" %>
    <%@ page errorPage="error.jsp" %>
    <%@ page isErrorPage="false" %>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int a=10;
int b=12;
public int dosum(){
	return a/b;
}
%>


<%
  Random ram =new Random();
  int rnum=ram.nextInt();
%>

<%=  "Random number: "+ rnum  %>
<%

out.print("addition of two number=>"+dosum());

%>

<%= "Addition of two number" + a + "&"+b  %>
    <%@ include file="Footer.jsp" %>
</body>
</html>