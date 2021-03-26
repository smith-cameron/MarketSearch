<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Market Search</title>
<link rel="stylesheet" href="">
</head>
<body>
	<div >
		<h1 >Login or Register</h1>
		<div id="regDiv">
			<h2 class="subHead">Register</h2>
			<form:form action="/register" method="post" modelAttribute="user">
					<form:errors class="validations" path="firstName"/>
				<div class="formGroup">
					<form:label path="firstName">First Name:</form:label>
					<form:input class="form-control" path="firstName"/>
				</div>
					<form:errors class="validations" path="lastName"/>
				<div class="formGroup">
					<form:label path="lastName">Last Name:</form:label>
					<form:input class="form-control" path="lastName"/>
				</div>
					<form:errors class="validations" path="email"/>
				<div class="formGroup">
					<form:label path="email">Email:</form:label>
					<form:input class="form-control" path="email"/>
				</div>
					<form:errors class="validations" path="password"/>
				<div class="formGroup">
					<form:label path="password">Password:</form:label>
					<form:input class="form-control" type="password" path="password"/>
				</div>
					<form:errors class="validations" path="confirmPassword"/>
				<div class="formGroup">
					<form:label path="confirmPassword">Confirm Password:</form:label>
					<form:input class="form-control" type="password" path="confirmPassword"/>
				</div>
				<input class="button" type="submit" value="Register">
			</form:form>
		</div>
		<div >
			<h2 >Login</h2>
			<h3 >${loginError}</h3>
			<form action="/login" method="post">
				<div class="formGroup">
					<label>Email:</label>
					<input class="form-control" type="email" name="loginEmail"/>
				</div>
				<div class="formGroup">
					<label>Password:</label>
					<input class="form-control" type="password" name="loginPassword"/>
				</div>
				<input class="button" type="submit" value="Login">
			</form>
		</div>
	</div>
</body>
</html>