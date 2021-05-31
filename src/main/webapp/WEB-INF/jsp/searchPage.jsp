<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search</title>
<style type="text/css">
	th { background-color: orange;color: white;}
	h2 {color: #00BFFF;}
</style>
</head>
<body>
<center>
	<h1> Search Employee Record </h1> <hr/>
	<form action="find" method="GET">
	<table border="5" width="58%">
		<tr>
			<th> Search by ID </th>
			<th> Search by Name </th>
			<th> Search by Address </th>
			<th> Select by Gender </th>
			<th> Action </th>
		</tr>
		
		<tr>
			<td> <input type="text" name="empid"> </td>
			<td> <input type="text" name="empname"> </td>
			<td> <input type="text" name="address"> </td>
			<td>
				<input type="radio" name="gender" value="Male">Male &nbsp;
				<input type="radio" name="gender" value="Female">Female &nbsp;
			</td>
			<td> <input type="submit" value="SEARCH"> </td>
		</tr>
	</table>
	</form>
<hr/>
		<table border="5" width="58%">
			<tr>
				<th> Employee ID </th>
				<th> Employee Name </th>
				<th> Employee Address </th>
				<th> Gender </th>
			</tr>
				<c:forEach var="tab" items="${data }">
			<tr>
				<td> ${tab.empid } </td>
				<td> ${tab.empname } </td>
				<td> ${tab.address } </td>
				<td> ${tab.gender } </td>
			</tr>
			</c:forEach>
		</table>
	
<hr/>
	<h2> ${msg } </h2>
</center>
</body>
</html>