<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="page1.jsp" method="get">
<input type="text" name="uname" > <br>
<input type="submit" value="Submit">
<% 
String s=request.getParameter("status");
if(s==null)
{
	s="";
}

%>

<h1 style="color:red"> <%=s %></h1>
</form>
</body>
</html>