<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head />
</head>
<body>
	<h3>Register for a prize by completing this form.</h3>

	<s:form action="register">
		<s:textfield key="registerUser.firstName" />
		<s:textfield key="registerUser.lastName" />
		<s:textfield key="registerUser.email" />
		<s:textfield key="registerUser.age" />
		<s:submit />
	</s:form>

</body>
</html>