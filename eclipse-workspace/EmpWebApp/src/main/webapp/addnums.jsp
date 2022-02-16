<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding two numbers</title>
</head>
<body>
<form action="Add/validate" method="post">

<table align="center" border="1">

<tr> 
<td colspan="2" align="center">Welcome to add program </td>
</tr>
<% if(request.getAttribute("errormsg") != null){ %>
<tr> 
<td colspan="2" align="center"><font color="red"><%= request.getAttribute("errormsg") %></font> </td>
</tr>
<%} %>
<tr>
<td> input1</td>
<td><input type="text" name="input1"/> </td>
</tr>
<tr>
<td> input2</td>
<td><input type="text" name="input2"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" name="Login" value="Login"/> </td>

</tr>


</table>

</form>



</body>
</html>