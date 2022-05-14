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
h1 {
 text-align:center;
}
</style>
<body>
<h1>Session Tracking URL</h1>
<h1>Hello....</h1>
<h1 style="color:red"><%=session.getAttribute("username") %></h1>
</body>
</html>
