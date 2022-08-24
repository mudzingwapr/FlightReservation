<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<div align="center"><h2>Welcome To Greens Flights</h2>

<form action="/RegisterUser" method="post">
FirstName		:<input type="text" name="firstName" required="required" placeholder="firstname"/><br/><br>
Surname  		:<input type="text" name="lastname"placeholder="Surname" required="required"/><br/><br>
Email		    :<input type="email" name="email"placeholder="email" required="required"/><br/><br>
Password		:<input type="password" name="password"required="required"/><br/><br>
     <input type="Submit" value="Register">
</form><br/><br>
<form action="/RegisterUser" method="post">
<h3>Existing User You Can Login</h3>
<input type="Submit" value="login">
</form>

</div>
</body>
</html>