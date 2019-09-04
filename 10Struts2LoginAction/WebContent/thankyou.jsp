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
	<h3>
		<s:text name="thankyou"></s:text>
	</h3>

	<p>
		Your registration information:
		<s:property value="registerUser" />
	</p>

	<p>
		<a href="<s:url action='index' />">Return to home page</a>.
	</p>
	<hr />
	<p>
		<a href="<s:url action='login' />">Logout Here</a>
	</p>
	<hr />
</body>
</html>