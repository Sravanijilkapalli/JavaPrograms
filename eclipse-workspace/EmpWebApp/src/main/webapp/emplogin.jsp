<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login/validate" method="post">

<table align="center" border="1">

<tr> 
<td colspan="2" align="center">Welcome to Employee Portal </td>
</tr>
<% if(request.getAttribute("errormsg") != null){ %>
<tr> 
<td colspan="2" align="center"><font color="red"><%= request.getAttribute("errormsg") %></font> </td>
</tr>
<%} %>
<tr>
<td> UserName</td>
<td><input type="text" name="username"/> </td>
</tr>
<tr>
<td> Password</td>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" name="Login" value="Login"/> </td>

</tr>
</table>

</form>
</body>
</html>