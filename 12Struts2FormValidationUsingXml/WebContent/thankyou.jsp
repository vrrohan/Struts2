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
		Your Preferred programming Language(s) :
		<s:iterator value="registerUser.progLang">
			<ul>
				<li><s:property /></li>
			</ul>
		</s:iterator>
	</p>
	<p>
		Your Favourite sports :
		<s:property value="registerUser.favouriteSports" />
	</p>
	<p>
		Your Date of birth :
		<s:property value="registerUser.dateOfBirth" />
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