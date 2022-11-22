<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<style>
li{
	list-style-type:none;
}

</style>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>
	<center>

		<p>Record Inserted with the following entered details</p>
		 
		<br> Passenger Id: ${reservation.pId }
		<br> First Name: ${reservation.firstName }
		<br> Last Name:${reservation.lastName }
		<br> Gender: ${reservation.gender }
		<br>
		<ul>
			<c:forEach items="${reservation.food}" var="meal">
				<li>${meal }</li>
			</c:forEach>

		</ul>
		<br>Leaving From: ${reservation.cityFrom }
		<br> Going To: ${reservation.cityTo }<br>



	</center>
</body>
</html>