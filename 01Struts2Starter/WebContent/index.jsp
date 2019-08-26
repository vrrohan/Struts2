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
	<h2>Index JSP Page</h2>
	<s:url action="/tutorials/getTutorial" var="getTutorialLink">
	</s:url>
	<p>
		<a href="${getTutorialLink}">Get Tutorial Page</a>
	</p>
</body>
</html>