<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Date: <%= new java.util.Date() %>
<%
String name = request.getParameter("name");
String pass = request.getParameter("pass");
if(name.equals("hema")  && pass.equalsIgnoreCase("ojas")){
%>
<table>
<tr>
<td>
Name: <%= name %>
</td>
</tr>
<tr>
<td>
Password: <%= pass %>
</td>
</tr>
<h1>User Logined Successfully</h1>
</table>
<%
}
else{%>
<table>
<h1>Invalid User</h1>
<%} %>
</table>
</body>
</html>