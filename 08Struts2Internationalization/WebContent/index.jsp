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
	<%-- 
	<s:url action="registerForm" var="formRegistrationLink"></s:url>
	<p>
		<a href="${formRegistrationLink}">Please register</a> for our prize
		drawing.
	</p> --%>
	<h3>Registro español</h3>
	<s:url action="registerForm" var="registerInputLinkES">
		<s:param name="request_locale">es</s:param>
	</s:url>
	<p>
		<s:a href="%{registerInputLinkES}">Por favor, regístrese</s:a>
		para nuestro sorteo
	</p>
	<hr />
	<s:text name="contact" />
</body>
</html>