<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%
Cookie ck=null;
Cookie [] cookie=null;

cookie=request.getCookies();

if(cookie!=null)
{
	for(int i=0;i<cookie.length;i++)
	{
		ck=cookie[i];
		out.print("Key is :" + ck.getName());
		out.print("Value is :" + ck.getValue());
	}
}
else{
	out.print("Cookies are not presen....");
}


%>
<body>
  <form action="delete.jsp" method="get">
   
     <input type=submit value="Delete cookies"> 
  </form>
</body>
</html>