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
	<h1>Welcome To Struts 2 MessageStore!</h1>
	<s:url action="hello" var="helloBruceLink">
		<s:param name="userName">Bruce Wills</s:param>
	</s:url>
	<p>
		<a href="<s:url action='hello'/>">Get Message Store</a>
	</p>
	<p>
		<a href="${helloBruceLink}">Hello Bruce Link</a>
	</p>
	<s:form action="hello">
		<s:textfield name="userName" label="Your name" />
		<s:submit value="Submit" />
	</s:form>

</body>
</html>