<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Market Search</title>
<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="/js/script.js">
<link rel="stylesheet" href="/js/script-api.js">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="min-h-screen bg-green-400 py-6 flex flex-col justify-center sm:py-12">
	<div class="relative py-3 sm:max-w-xl sm:mx-auto">
	<div class="absolute inset-0 bg-gradient-to-r from-red-400 to-light-blue-500 shadow-lg transform -skew-y-6 sm:skew-y-0 sm:-rotate-6 sm:rounded-3xl"></div>
	<div class="relative px-4 py-10 bg-white shadow-lg sm:rounded-3xl sm:p-20">
	<div class="max-w-md mx-auto">
	<div class="flex content-evenly py-4">
	<div class=flex-shink>
		<img src="/img/storefront.png"
			class="h-7 sm:h-10 animate-bounce " />
	</div>
	<div class=flex-auto>
		<p class="text-4xl font-bold text-gray-900 ">Market Place</p>
	</div>
	</div>
	<div class="divide-y divide-gray-200">
	<div class="bg-white shadow p-4 flex">
		<form method="post" action="/search">
			<p>
				Barcode: <input name="barcode" />
				<button type="submit">search</button>
			</p>
		</form>
	</div>
	<div class="pt-6 text-base leading-6 font-bold sm:text-lg sm:leading-7">
		<p>Login and Registration</p>
		<p class=animate-pulse>
			<a href="/marketsearch/login" class="text-indigo-600 hover:text-red-700 ">
				click here &rarr; </a>
		</p>
	</div>
	</div>
	</div>
	</div>
	</div>
	</div>
</body>
</html>