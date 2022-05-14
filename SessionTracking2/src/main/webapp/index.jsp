<%@page import="java.util.Date" %>
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
 color:black;
 font-size:26px;
 background-image: linear-gradient(45deg,#328f8a,#08ac4b);
 font-family: "Roboto", sans-serif;
 -webkit-font-smoothing: antialiased;
 -moz-osx-font-smoothing: grayscale;
 text-align:center;
}
</style>
<body>
 <%
 Date CreationTime=new Date(session.getCreationTime());
 Date LastAccTime=new Date(session.getLastAccessedTime());
 
 //set attribute method need to use create attribute as well as
 
 String UsernameAttribute=new String("UserID");//attribute
 String UserID=new String("Keshav");//value
 
 String CountAttribute=new String("VisitCount");
 Integer vscount=new Integer(0);
 String title=new String("Hello");
 if(session.isNew())
 {
 title="Welcome to Keshav Website";
 session.setAttribute(UsernameAttribute, UserID);
 session.setAttribute(CountAttribute, vscount);
 }
 else{
 title="Hi...Keshav this side, How are you?";
 vscount=(Integer)session.getAttribute(CountAttribute);
 vscount=vscount+1;
 session.setAttribute(UsernameAttribute, UserID);
 session.setAttribute(CountAttribute, vscount);
 }
 %>
 <table>
 <tr>
 <td >Session id</td>
 <td><%out.print(session.getId()); %></td>
 </tr>
 <tr>
 <td>Creation Time</td>
 <td><%=CreationTime %></td>
 </tr>
 <tr>
 <td>Last Access Time</td>
 <td><%=LastAccTime %></td>
 </tr>
 <tr>
 <td>User Name</td>
 <td><%=UserID %></td>
 </tr>
 <tr>
 <td>Visit Count</td>
 <td><%=vscount %></td>
 </tr>
 <tr>
 <td>Msg</td>
 <td><%=title%></td>
 </tr>
 </table>
</body>
</html>