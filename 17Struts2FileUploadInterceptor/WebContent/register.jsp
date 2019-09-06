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
	<h3>Upload a text file.</h3>

	<s:form action="uploadAction" method="POST"
		enctype="multipart/form-data">
		<s:file name="myFile" label="Select a File to upload" size="40" />
		<s:submit value="submit" name="submit" />
	</s:form>

</body>
</html>