<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.errors {
	background-color: #FFCCCC;
	border: 1px solid #CC0000;
	width: 400px;
	margin-bottom: 3px;
}

.errors li {
	list-style: none;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head />
</head>
<body>
	<h3>Upload a text file.</h3>
	<s:if test="hasActionErrors()">
		<div class="errors">
			<s:actionerror />
		</div>
	</s:if>
	<s:form action="uploadAction" method="POST"
		enctype="multipart/form-data">
		<s:file name="userImage" label="Select a File to upload" size="40" />
		<s:submit value="submit" name="submit" />
	</s:form>

</body>
</html>