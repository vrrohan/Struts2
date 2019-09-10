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
	<h3>Thank you for registering for a prize.</h3>

	<p>
		Your Name :
		<s:property value="firstName" />
		<s:property value="lastName" />
	</p>
	<p>
		Email id :
		<s:property value="email"></s:property>
	</p>
	<p>
		Age :
		<s:property value="age"></s:property>
	</p>
	<p>
		<a href="<s:url action='index' />">Return to home page</a>.
	</p>
</body>
</html>