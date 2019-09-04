<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
<head>
<sx:head />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head />
</head>
<body>
	<h3>Register for a prize by completing this form.</h3>

	<s:form action="register">
		<s:textfield key="registerUser.firstName" />
		<s:textfield key="registerUser.lastName" />
		<s:textfield key="registerUser.email" />
		<s:textfield key="registerUser.age" />
		<s:select key="registerUser.sports" name="favouriteSports"
			list="favouriteSports" value="defaultFavouriteSports"></s:select>
		<s:radio key="registerUser.gender" name="userGender" list="userGender"
			value="defaultGenderValue"></s:radio>
		<s:checkboxlist key="registerUser.programmingLanguages"
			list="programmingLanguages" name="programmingLanguages"
			value="defaultProgrammingLanguage"></s:checkboxlist>
		<s:checkbox key="registerUser.ageAbove18" value="ageAbove18"></s:checkbox>
		<sx:datetimepicker name="dateOfBirth" key="Date Of Birth"
			displayFormat="dd/MM/yyyy" value="%{'2010-01-01'}"></sx:datetimepicker>
		<s:submit />
	</s:form>

</body>
</html>