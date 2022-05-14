<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<%

Cookie Username=new Cookie("u_name",request.getParameter("uname"));
Cookie Mobile=new Cookie("m_no",request.getParameter("mob"));

Username.setMaxAge(60*60*24);
Mobile.setMaxAge(60*60*24);

response.addCookie(Username);
response.addCookie(Mobile);

%>
<body>
  <h1>Cookies add succesfully at client side</h1>
  <form action="Read.jsp" method="get">
   
     <input type=submit value="Read cookies"> 
  </form>
</body>
</html>