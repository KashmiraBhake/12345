<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
	h2 { color: #32CD32;}
	input {text-transform: capitalize;}
</style>
</head>
<body>
<h1> New Register Employee </h1> <hr/>
<form action="insert" method="POST">
	Employee Id <br/>
	<input type="text" name="empid" autofocus="autofocus"> <br/>
	Employee Name <br/>
	<input type="text" name="empname"> <br/>
	Employee Address <br/>
	<input type="text" name="address"> <br/>
	Select Gender <br/>
		<input type="radio" name="gender" value="Male" checked="checked">Male &nbsp;&nbsp;
		<input type="radio" name="gender" value="Female">Female <br/>
	<br/>
	<input type="submit" value="REGISTER">	
</form>
<hr/>
	<h2> ${msg } </h2>
	
</body>
</html>