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
<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
	<div>
		<h1 >Login or Register</h1>
		<div id="regDiv">
			<h2 class="subHead">Register</h2>
			<form:form action="/marketsearch/register" method="post" modelAttribute="user">
					<form:errors class="validations" path="firstName"/>
				<div class="flex flex-col mb-4">
					<form:label class="mb-2 uppercase font-bold text-lg text-grey-darkest" path="firstName">First Name:</form:label>
					<form:input class="border py-2 px-3 text-grey-darkest" path="firstName"/>
				</div>
					<form:errors class="validations" path="lastName"/>
				<div class="flex flex-col mb-4">
					<form:label class="mb-2 uppercase font-bold text-lg text-grey-darkest" path="lastName">Last Name:</form:label>
					<form:input class="border py-2 px-3 text-grey-darkest" path="lastName"/>
				</div>
					<form:errors class="validations" path="email"/>
				<div class="flex flex-col mb-4">
					<form:label class="mb-2 uppercase font-bold text-lg text-grey-darkest" path="email">Email:</form:label>
					<form:input class="border py-2 px-3 text-grey-darkest" path="email"/>
				</div>
					<form:errors class="validations" path="password"/>
				<div class="flex flex-col mb-4">
					<form:label class="mb-2 uppercase font-bold text-lg text-grey-darkest" path="password">Password:</form:label>
					<form:input class="border py-2 px-3 text-grey-darkest" type="password" path="password"/>
				</div>
					<form:errors class="validations" path="confirmPassword"/>
				<div class="flex flex-col mb-6">
					<form:label class="mb-2 uppercase font-bold text-lg text-grey-darkest" path="confirmPassword">Confirm Password:</form:label>
					<form:input class="border py-2 px-3 text-grey-darkest" type="password" path="confirmPassword"/>
				</div>
				<input class="block bg-blue hover:bg-blue-dark text-white uppercase text-lg mx-auto p-4 rounded" type="submit" value="Register">
			</form:form>
		</div>
		<div >
			<h2 >Login</h2>
			<h3 >${loginError}</h3>
			<form action="/marketsearch/login" method="post">
				<div class="flex flex-col mb-4">
					<label class="mb-2 uppercase font-bold text-lg text-grey-darkest">Email:</label>
					<input class="border py-2 px-3 text-grey-darkest" type="email" name="loginEmail"/>
				</div>
				<div class="flex flex-col mb-6">
					<label class="mb-2 uppercase font-bold text-lg text-grey-darkest">Password:</label>
					<input class="border py-2 px-3 text-grey-darkest" type="password" name="loginPassword"/>
				</div>
				<input class="block bg-green hover:bg-green-dark text-white uppercase text-lg mx-auto p-4 rounded" type="submit" value="Login">
			</form>
		</div>
	</div>
</body>
</html>