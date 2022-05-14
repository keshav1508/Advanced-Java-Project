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
 
 Cookie ck=null;
 Cookie [] cookie=null;
 cookie=request.getCookies();
 
 if(cookie!=null)
 {
	 for(int i=0;i<cookie.length;i++)
	 {
		 ck=cookie[i];
		 
		 if(ck.getName().compareTo("u_name")==0)
		 {
			 ck.setMaxAge(0);
			 response.addCookie(ck);
		 }
		 if(ck.getName().compareTo("m_no")==0)
		 {
			 ck.setMaxAge(0);
			 response.addCookie(ck);
		 }
	 }
 }
 else{
	 out.print("cookies are not avaible");
 }
 
 %>
 
 <h1>Cookies Deleted Successfully......</h1>
   <form action="Read.jsp" method="get">
   
     <input type=submit value="Read cookies"> 
  </form>
</body>
</html>