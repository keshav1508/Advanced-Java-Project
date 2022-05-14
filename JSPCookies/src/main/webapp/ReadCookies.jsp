<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Cookies</title>
<style>
@import url(https://fonts.googleapis.com/css?family=Roboto:400,300,500);
*:focus {
 outline: none;
}
body {
 margin: 0;
 padding: 0;
 background: #DDD;
 font-size: 16px;
 color: #222;
 font-family: 'Roboto', sans-serif;
 font-weight: 300;
}
#login-box {
 position: relative;
 margin: 5% auto;
 width: 600px;
 height: 400px;
 background: #FFF;
 border-radius: 2px;
 box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
}
.left {
 position: absolute;
 top: 0;
 left: 0;
 box-sizing: border-box;
 padding: 40px;
 width: 300px;
 height: 400px;
}
h1 {
 margin: 0 0 20px 0;
 font-weight: 300;
 font-size: 28px;
}
input[type="text"],
input[type="password"] {
 display: block;
 box-sizing: border-box;
 margin-bottom: 20px;
 padding: 4px;
 width: 220px;
 height: 32px;
 border: none;
 border-bottom: 1px solid #AAA;
 font-family: 'Roboto', sans-serif;
 font-weight: 400;
 font-size: 15px;
 transition: 0.2s ease;
}
input[type="text"]:focus,
input[type="password"]:focus {
 border-bottom: 2px solid #16a085;
 color: #16a085;
 transition: 0.2s ease;
}
input[type="submit"] {
 margin-top: 28px;
 width: 120px;
 height: 32px;
 background: #16a085;
 border: none;
 border-radius: 2px;
 color: #FFF;
 font-family: 'Roboto', sans-serif;
 font-weight: 500;
 text-transform: uppercase;
 transition: 0.1s ease;
 cursor: pointer;
}
input[type="submit"]:hover,
input[type="submit"]:focus {
 opacity: 0.8;
 box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
 transition: 0.1s ease;
}
input[type="submit"]:active {
 opacity: 1;
 box-shadow: 0 1px 2px rgba(0, 0, 0, 0.4);
 transition: 0.1s ease;
}
.or {
 position: absolute;
 top: 180px;
 left: 280px;
 width: 40px;
 height: 40px;
 background: #DDD;
 border-radius: 50%;
 box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
 line-height: 40px;
 text-align: center;
}
.right {
 position: absolute;
 top: 0;
 right: 0;
 box-sizing: border-box;
 padding: 40px;
 width: 300px;
 height: 400px;
 background: url('https://goo.gl/YbktSj');
 background-size: cover;
 background-position: center;
 border-radius: 0 2px 2px 0;
}
.right .loginwith {
 display: block;
 margin-bottom: 40px;
 font-size: 28px;
 color: #FFF;
 text-align: center;
}
button.social-signin {
 margin-bottom: 20px;
 width: 220px;
 height: 36px;
 border: none;
 border-radius: 2px;
 color: #FFF;
 font-family: 'Roboto', sans-serif;
 font-weight: 500;
 transition: 0.2s ease;
 cursor: pointer;
}
button.social-signin:hover,
button.social-signin:focus {
 box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
 transition: 0.2s ease;
}
button.social-signin:active {
 box-shadow: 0 1px 2px rgba(0, 0, 0, 0.4);
 transition: 0.2s ease;
}
button.social-signin.facebook {
 background: #32508E;
}
button.social-signin.twitter {
 background: #55ACEE;
}
button.social-signin.google {
 background: #DD4B39;
}
</style>
</head>
<body>
<%
Cookie ck=null; //1. Create objects
Cookie [] cookie=null;//2. an array of cookies
//3.get cookies- retrive
cookie=request.getCookies();
%>
<h1 style="text-align:center;color:red;font-size:30px">Cookies Found</h1>
<%if(cookie!=null)
 {
for(int i=0;i<cookie.length;i++)
{
// to get key use function getName();
//to get value use function getValue();
ck=cookie[i];
out.print(" Value is: "+ck.getValue()+"<br>");
}
}
else
{
out.print("Cookies are not available...");
} %>
<div id="login-box">
 <div class="left">
 
<%
 //java Code
//4. Logic to print cookies
if(cookie!=null)
{
for(int i=0;i<cookie.length;i++)
{
// to get key use function getName();
//to get value use function getValue();
ck=cookie[i];
out.print(" Key is: "+ck.getName()+"<br>");
// out.print(" Value is: "+ck.getValue());
}
}
else
{
out.print("Cookies are not available...");
}
%>
 </div>
 <div class="right">
 
 <span class="loginwith">Perform Action<br /></span>
 <form action="ReadCookies.jsp" method="get">
<button class="social-signin facebook">Read Cookies</button>
</form>
<br>
<form action="DeleteCookies.jsp" method="get">
 <button class="social-signin twitter">Delete Cookies</button>
 </form>
 
 </div>
 <div class="or">OR</div>
</div>
</body>
</html>