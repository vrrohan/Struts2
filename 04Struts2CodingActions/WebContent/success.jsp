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
	<h2>Tutorial Success JSP Page</h2>
	<hr>
	<s:property value="messageStore.message" />
	<p>
		UserName is :
		<s:property value="userName" />
	</p>
	<p>
		This link has been clicked
		<s:property value="count" />
		times...
	</p>
</body>
</html>