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
		<s:textfield name="personBean.firstName" label="First name" />
		<s:textfield name="personBean.lastName" label="Last name" />
		<s:textfield name="personBean.email" label="Email" />
		<s:textfield name="personBean.age" label="Age" />
		<s:submit />
	</s:form>

</body>
</html>