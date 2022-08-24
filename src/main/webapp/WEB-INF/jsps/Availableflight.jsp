<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Flights </title>
</head>
<body>
<div align="center">
<h2>Select You Flight</h2>

<table border="1">
   <tr>    <th>AirLine</th>
            <th>departure City</th>
            <th>Destination City</th>
            <th>Date of Departure</th>
            <th>EstimatedapartureTime</th>
            <th>Choose flight</th>
        </tr>
   <c:forEach items ="${flights}" var="flight">
    <tr>
   <td>${flight.operatingAirline}</td>
   <td>${flight.departureCity}</td>
   <td>${flight.arrivalCity}</td>
   <td>${flight.dateofDeparture}</td>
   <td>${flight.estimatedapartureTime}</td>
   <td><a href="CompleteReseravation?flightid=${flight.id}">select</a></td>
    </tr>
  </c:forEach>
</table>
</div>

</body>
</html>