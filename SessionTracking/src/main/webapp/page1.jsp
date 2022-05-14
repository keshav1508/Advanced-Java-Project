<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
@import url(https://fonts.googleapis.com/css?family=Roboto:300);
body {
 background-color: #328f8a;
 background-image: linear-gradient(45deg,#328f8a,#08ac4b);
 font-family: "Roboto", sans-serif;
 -webkit-font-smoothing: antialiased;
 -moz-osx-font-smoothing: grayscale;
}
</style>
<body>
<h1>Page1</h1>
<%
 //javacode-c-scriplet tag
 String name=request.getParameter("fname");
 if(name.equals("Keshav"))
 {
 session.setAttribute("username", name);
 //encodeUrl-used to encode / append data to URL
 String UpdatedURL=response.encodeUrl("page2.jsp?username=+name");
%>
 <a href='<%=UpdatedURL%>'>Click here to run page 2</a>
<%
 }
 else
 {
 response.sendRedirect("index.jsp?status=Username not valid");
 }
%>
</body>
</html>
