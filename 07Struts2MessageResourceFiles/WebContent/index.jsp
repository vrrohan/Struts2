<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:url action="registerForm" var="formRegistrationLink"></s:url>
	<p>
		<a href="${formRegistrationLink}">Please register</a> for our prize
		drawing.
	</p>
	<hr />
	<s:text name="contact" />
</body>
</html>