<%@page import="java.sql.Date"%>
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
Date CreationTime=new Date(session.getCreationTime());
Date EndingTime=new Date(session.getLastAccessedTime());
String UsernameAttribute=new String("Userid");  //key
String UserId=new String("Keshav");

String CountAttribute=new String("VSCOUNT");  //key 
Integer vs=new Integer(0);
String Title=new String();

 if(session.isNew())
 {
	 Title="hi";
	 session.setAttribute(UsernameAttribute, UserId);
	 session.setAttribute(CountAttribute, vs);
 }
 else{
	 Title="hello keshav this side";
	 vs=(Integer)session.getAttribute(CountAttribute);
	 vs=vs+1;
	 session.setAttribute(UsernameAttribute, UserId);
	 session.setAttribute(CountAttribute, vs);
 }

%>
</body>
     <h1 style="color:blue"> Send Redirect method in url writing</h1>
<table>
  <tr>
      <td>SessionID</td>
      <td><% out.print(session.getId()); %></td> 
   </tr>
   <tr>
      <td>CreationTime</td>
      <td><%=CreationTime %></td> 
   </tr>
    <tr>
      <td>EndingTime</td>
      <td><%=EndingTime %></td> 
   </tr>
    <tr>
      <td>UsernameAttribute</td>
      <td><%=UserId %></td> 
   </tr>
    <tr>
      <td>CountAttribute</td>
      <td><%=vs %></td> 
   </tr>
    <tr>
      <td>Msg</td>
      <td><%=Title %></td> 
   </tr>

</table>




</html>