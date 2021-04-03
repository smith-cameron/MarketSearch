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
<div class="min-h-screen bg-green-400 py-6 flex flex-col justify-center sm:py-12">
	<div class="w-full">
		<div class="absolute inset-0 bg-gradient-to-r from-red-400 to-light-blue-500 shadow-lg transform -skew-y-6 sm:skew-y-0 sm:-rotate-6 sm:rounded-3xl"></div>
			<div class="relative px-4 py-10 bg-white shadow-lg sm:rounded-3xl sm:p-10">
			<div class="flex content-evenly pb-4">
				<div class=flex-shink>
					<img src="/img/storefront.png" class="h-7 sm:h-10" />
				</div>
				<div class=flex-auto>
					<p class="text-4xl font-bold text-gray-900">Market Place</p>
				</div>
			</div>
			<h1 class="mb-8 uppercase font-bold text-2xl text-center">Login or Register</h1>
			<div class="mb-6 border border-gray-400 rounded-lg p-8">
				<h2 class="mb-4 uppercase font-bold text-xl">Login</h2>
				<h3 >${loginError}</h3>
				<form action="/marketsearch/login" method="post">
					<div class="flex flex-col mb-4">
						<label class="mb-2 uppercase text-lg text-gray-600">Email:</label>
						<input class="border py-2 px-3 text-grey-darkest" type="email" name="loginEmail"/>
					</div>
					<div class="flex flex-col mb-6">
						<label class="mb-2 uppercase text-lg text-gray-600">Password:</label>
						<input class="border py-2 px-3 text-grey-darkest" type="password" name="loginPassword"/>
					</div>
					<input class="block bg-green-500 hover:bg-green-600 text-white uppercase text-lg mx-auto p-4 rounded" type="submit" value="Login">
				</form>
			</div>
			<div class="border border-gray-400 rounded-lg p-8">
				<h2 class="mb-4 uppercase font-bold text-xl ">Register</h2>
				<form:form action="/marketsearch/register" method="post" modelAttribute="user">
						<form:errors class="validations" path="firstName"/>
					<div class="flex flex-col mb-4">
						<form:label class="mb-2 uppercase text-lg text-gray-600" path="firstName">First Name:</form:label>
						<form:input class="border py-2 px-3 text-grey-darkest" path="firstName"/>
					</div>
						<form:errors class="validations" path="lastName"/>
					<div class="flex flex-col mb-4">
						<form:label class="mb-2 uppercase text-lg text-gray-600" path="lastName">Last Name:</form:label>
						<form:input class="border py-2 px-3 text-grey-darkest" path="lastName"/>
					</div>
						<form:errors class="validations" path="email"/>
					<div class="flex flex-col mb-4">
						<form:label class="mb-2 uppercase text-lg text-gray-600" path="email">Email:</form:label>
						<form:input class="border py-2 px-3 text-grey-darkest" path="email"/>
					</div>
						<form:errors class="validations" path="password"/>
					<div class="flex flex-col mb-4">
						<form:label class="mb-2 uppercase text-lg text-gray-600" path="password">Password:</form:label>
						<form:input class="border py-2 px-3 text-grey-darkest" type="password" path="password"/>
					</div>
						<form:errors class="validations" path="confirmPassword"/>
					<div class="flex flex-col mb-6">
						<form:label class="mb-2 uppercase text-lg text-gray-600" path="confirmPassword">Confirm Password:</form:label>
						<form:input class="border py-2 px-3 text-grey-darkest" type="password" path="confirmPassword"/>
					</div>
					<input class="block bg-blue-500 hover:bg-blue-600 text-white uppercase text-lg mx-auto p-4 rounded" type="submit" value="Register">
				</form:form>
			</div>
		</div>
	</div>
</div>	
				
</body>
</html>