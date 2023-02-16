<%@page import="org.w3c.dom.css.RGBColor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<title>Property Taxation System</title>
</head>
<body>
	<div class="container">
		<br>
		<h1 class="text-secondry">Property Taxation System</h1>
		<br>
		<form action="add" method="post">
			<button class="btn btn-primary">Add Records</button>
		</form>
	</div>
</body>
</html>