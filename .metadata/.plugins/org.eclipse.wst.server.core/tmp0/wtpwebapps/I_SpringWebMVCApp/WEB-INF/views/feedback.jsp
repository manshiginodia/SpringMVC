<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ page import ="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Feed Back page</p>

<% String name = (String)request.getAttribute("MyName");
//List<String> friendsname= (List<String> request.getAttribute("MyFriends"));
//for eac
%>
<%= name %>
<p> I am ${MyName}</p>
</body>
</html>