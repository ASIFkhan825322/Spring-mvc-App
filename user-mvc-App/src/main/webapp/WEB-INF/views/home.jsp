<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${user!=null}">
		<h3>
			<a href="">Edit</a>
		</h3>
		<h3>
			<a href="">Profile</a>
		</h3>
		<h3>
			<a href="">Delete</a>
		</h3>
		<h3>
			<a href="">Logout</a>
		</h3>
	</c:if>
</body>
</html>