<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:set var="g" value="${param.n1}"></c:set>
<c:set var="f" value="${param.n2}"></c:set>
<c:set var="m" value="${g+f}"></c:set>
<h1>Score <c:out value="${m}"></c:out></h1>
<c:choose>
<c:when test="${m>=75}">
  <h1 style="color:red"> A+ </h1>
</c:when>
<c:when test="${m>=60}">
  <h1 style="color:red">B+</h1>
</c:when>
<c:when test="${m>=35}">
  <h1 style="color:red">C+</h1>
</c:when>
<c:when test="${m<35}">
  <h1 style="color:red">Fail</h1>
</c:when>
</c:choose>
</body>
</html>