<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>About us page</p>

<%
	String serverMsg = (String)  request.getAttribute("cname");
%>
<%=serverMsg %>

<p>${cname}</p>

empid ${eid}
ename ${ename}

</body>
</html>