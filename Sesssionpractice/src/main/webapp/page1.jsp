<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%

String name=request.getParameter("uname");
if(name.equals("keshav"))
{
	  session.setAttribute("username",name);
	  String Urlupdated=response.encodeURL("page2.jsp?username=+name");

%>
    <a href='<%=Urlupdated%>'>Click here to go to page 2</a>
  <%
  
   }
  
  else
  {
  response.sendRedirect("index.jsp?status=Username not valid");
  }%>
 

<body>

</body>
</html>