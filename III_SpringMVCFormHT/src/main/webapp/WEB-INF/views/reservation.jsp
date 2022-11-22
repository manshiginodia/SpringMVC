<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="tagform"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IRCTC Reservation Form</title>
</head>
<body>
<center>
	<!--  spring form -->
	<h3>Reservation Form</h3>
	<tagform:form action="submitForm" modelAttribute="reservation">
Passenger Id: <tagform:input path="pId"></tagform:input>
		<br />
		<br />
First Name: <tagform:input path="firstName"></tagform:input>
		<br />
		<br />
Last Name: <tagform:input path="lastName"></tagform:input>
		<br />
		<br />
Gender: 
Male:  <tagform:radiobutton path="gender" value="Male" />
FeMale:  <tagform:radiobutton path="gender" value="Female" />
		<br />
		<br />
Meals:
Breakfast: <tagform:checkbox path="food" value="Breakfast" />
Lunch: <tagform:checkbox path="food" value="Lunch" />
Dinner: <tagform:checkbox path="food" value="Dinner" />
		<br />
		<br />
Leaving From:
<tagform:select path="cityFrom">
			<tagform:option value="Chennai">Chennai</tagform:option>
			<tagform:option value="Mumbai">Mumbai</tagform:option>
			<tagform:option value="Delhi">Delhi</tagform:option>
			<tagform:option value="Kolkata">Kolkata</tagform:option>
		</tagform:select>
		<br />
		<br />

Going To:
<tagform:select path="cityTo">
			<tagform:option value="Chennai">Chennai</tagform:option>
			<tagform:option value="Mumbai">Mumbai</tagform:option>
			<tagform:option value="Delhi">Delhi</tagform:option>
			<tagform:option value="Kolkata">Kolkata</tagform:option>
		</tagform:select>
		<br />
		<br />

		<input type="submit" value="Submit">

	</tagform:form>

</center>



</body>
</html>