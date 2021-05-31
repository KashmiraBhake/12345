<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
<style type="text/css">
	.msglist { color: #00BFFF;}
	.msgdelete {color: #DC143C; }
</style>
</head>
<body>
<h1> Employee Operations </h1> <hr/>

	<a href="register"> New Employee </a> 
	| <a href="display"> DisplayAll/Update/Delete</a>
	| <a href="search"> Search </a>
	| <a href="deleteall"> Delete All</a>
	
	<hr/>
	
	<h2 class="msgdelete"> ${msg } </h2>
	<h2 class="msglist"> ${msgs } </h2>
</body>
</html>