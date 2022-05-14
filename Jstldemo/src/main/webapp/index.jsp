<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL DEMO</title>
</head>
<body>
<h1>JSTL</h1>

<!-- 1.set -->

<c:set var="age" value="17" scope="application"></c:set>

<!-- 2.out printing -->

<h1> Your age is:<c:out value="${age}"></c:out></h1>

<!-- 3.Remove Delete -->
<!-- <c:remove var="age"/> -->

<!-- 4.if -->
<c:if test="${age>18}">
  <h1>Congrats !!! you are eligible for voting</h1>
</c:if>
<!-- 5.for -->

  <c:forEach var = "i" begin = "1" end = "8">
         <h2 style="color:blue">Value of i is:<c:out value = "${i}"/></h2>
      </c:forEach>
<c:remove var="age"/>
<!-- 6. choose 7. when 8. otherwise -->
<c:set var="number" value="7"></c:set>
<c:choose>
     <c:when test ="${number>0 }">
        <h2 style="color:green">Number is positive</h2>
     </c:when>
       <c:when test ="${number<0 }">
        <h2 style="color:green">Number is Negative</h2>
     </c:when>
     <c:otherwise>
        <h2 style="color:green">Number is Zero</h2>
     </c:otherwise>
</c:choose>
<a href="Demo.jsp">Click here to run page 2</a>
</body>
</html>