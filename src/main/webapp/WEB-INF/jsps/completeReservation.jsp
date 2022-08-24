<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Your Reservation </title>
</head>
<body>
<div align="center">
 Flight Number:        <u> ${fl.flightno}          <br/></u>
Operatine_Airline:     <u>${fl.operatingAirline}   <br/></u>
Departure_City:        <u>${fl.departureCity}      <br/></u>
Destination_City:      <u>${fl.arrivalCity}        <br/></u>
Date Of Departure And Estimated Time : <u>${fl.estimatedapartureTime}<br/></u>

<form action="completeReservation" method="post">
<pre>
<h3><b>Passenger  Details:</b></h3>
First Name:     <input type="text" name="firstname"required="required"/><br/>
Last Name:      <input type="text" name="lastName" required="required"/><br/>
Email Name:     <input type="email" name="email" required="required"/><br/>
Phone Number:   <input type="text" name="phoneNumber" required="required"/><br/>

<h3>Credit Card Details</h3>
Name On the Card:            <input type="text" name="nameOnTheCard"/><br/>
Card  No:                    <input type="text" name="cardNumber"/><br/>
Expiration Date:             <input type="text" name="expirationDate"/><br/>
Three digit Security Code:   <input type="text" name="securityCode"/><br/>
<input type="hidden" name="flightid" value = "${fl.id}">
<input type="submit" value="confirm">
</pre>
</form>
</div>
</body>
</html>