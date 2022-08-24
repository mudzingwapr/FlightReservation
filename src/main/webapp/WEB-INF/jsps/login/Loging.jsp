<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here </title>
</head>
<body>
<div align="center">
<h3>Register as New <a href="/showReg">Register</a></h3>
<p><h2>Login Here if Existing User</h2><p>
<form action="/flight" method="post">
UserName   : <input type="text" name="email"required="required" /><br/><br/>
Password   : <input type="password" name="password" required="required"/><br/><br/>
 <input type="Submit" value="Login"/>
 
</form>
${msg}
</div>
</body>
</html>