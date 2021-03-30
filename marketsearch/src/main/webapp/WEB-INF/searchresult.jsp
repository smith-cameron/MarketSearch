<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div >
		<hr>
	<table class="table table-dark">
		<thead>
			<tr>
				<th>Title One</th>
				<th>BasePrice</th>
				<th>BestPrice</th>
			</tr>
		</thead>
		<tbody>
		<tr>
	        <td><c:out value="${results.title}" /></td>
	        <td><c:out value="${results.basePrice}" /></td>
	        <td><c:out value="${results.bestPrice}" /></td>
	    </tr>
			</tbody>
	</table>
</div>
</body>
</html>