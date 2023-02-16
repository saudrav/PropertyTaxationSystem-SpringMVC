<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
		<h3 class="text-primary">Property Taxation System</h3>
		<br>
		<form action="add">
				<button class="btn btn-primary">Show Records</button>
		</form>
		<br>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Property Id</th>
					<th>OwnersName</th>
					<th>AreaInSqFt</th>
					<th>PropertyType</th>
					<th>TaxAmount</th>
					<th>DateOfPyt</th>
					<th>DueDate</th>
					<th>RevisedTaxAmtInRs</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="propertyTaxPyt" items="${propertyTaxPyts}">
					<tr>
						<td>${propertyTaxPyt.propertyId }</td>
						<td>${propertyTaxPyt.ownersName }</td>
						<td>${propertyTaxPyt.areaInSqFt }</td>
						<td>${propertyTaxPyt.propertyType }</td>
						<td>${propertyTaxPyt.taxAmount }</td>
						<td>${propertyTaxPyt.dateOfPyt }</td>
						<td>${propertyTaxPyt.dueDate }</td>
						<td>${propertyTaxPyt.revisedTaxAmt }</td>
					</tr>
				
				</c:forEach>
			</tbody>
			
		</table>
	</div>
</body>
</html>