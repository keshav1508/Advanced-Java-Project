<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
footer {
  text-align: center;
  padding: 3px;
  background-color: DarkSalmon;
  color: white;
}
</style>
</head>
<body>
<footer>
  <p>Author: @CopyRight Issue<br>
  <a href="https://mitaoe.ac.in/">https://mitaoe.ac.in/</a></p>
  <h2 style="color:black"><% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %></h2>
</footer>
</body>
</html>