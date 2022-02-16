<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding numbers Result page</title>
</head>
<body>
<% if(request.getAttribute("answer") != null){ %>

total
<font color="red"><%= request.getAttribute("answer") %></font> 
<%} %>

</body>
</html>