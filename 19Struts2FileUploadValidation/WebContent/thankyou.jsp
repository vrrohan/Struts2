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
	<h3>File Uploaded Successfully</h3>

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