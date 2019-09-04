<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person Login Form</title>
<s:head />
</head>
<body>
	<s:form action="loginForm">
		<s:textfield label="LoginID" name="personLogin.userId"></s:textfield>
		<s:password label="Password" name="personLogin.password"></s:password>
		<s:submit value="Submit"></s:submit>
	</s:form>
</body>
</html>