<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>

<!-- simple redirect -->

 <!-- redirect with param -->
 <c:url var="myurl" value="http://www.google.com/search">
 <c:param name="q" value="Github"></c:param>
 </c:url>
  <c:redirect url="${myurl}"></c:redirect>
</body>
</html>