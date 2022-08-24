<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights Here</title>
</head>
<body>
<div align ="center">
<h2>Find Flights Here</h2>
<form action="/findflight" method="post">
City from   :<input type="text" name ="from"placeholder="city from">
City To     :<input type="text" name ="to"placeholder="city to">
Date        :<input type="text" name ="dedate"placeholder="yyyy-mm-dd">
<input type="submit" value="search">
</form>

</div>
</body>
</html>