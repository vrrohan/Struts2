<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<style type="text/css">
.welcome {
	background-color: #DDFFDD;
	border: 1px solid #009900;
	width: 400px;
}

.welcome li {
	list-style: none;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:if test="hasActionMessages()">
		<div class="welcome">
			<s:actionmessage />
		</div>
	</s:if>
	<p>
		Filename :
		<s:property value="userImageFileName" />
	</p>
	<br />
	<p>
		Content Type :
		<s:property value="userImageContentType"></s:property>
	</p>
	<br>
	<p>
		Uploaded File :
		<s:property value="userImage" />
	</p>
	<p>
		Uploaded Image: <img
			src="images/<s:property value="userImageFileName"/>" width="100"
			height="100" />
	</p>

	<p>
		<a href="<s:url action='index' />">Return to home page</a>.
	</p>
</body>
</html>