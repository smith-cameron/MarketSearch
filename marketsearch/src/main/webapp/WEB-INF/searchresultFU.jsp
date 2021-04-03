<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
<div class="min-h-screen bg-green-400 py-6 flex flex-col justify-center sm:py-12">
		<div class="w-full">
			<div class="absolute inset-0 bg-gradient-to-r from-red-400 to-light-blue-500 shadow-lg transform -skew-y-6 sm:skew-y-0 sm:-rotate-6 sm:rounded-3xl"></div>
			<div class="relative px-4 py-10 bg-white shadow-lg sm:rounded-3xl sm:p-20">
				<div class="flex content-evenly py-4">
					<div class=flex-shink>
						<img src="/img/storefront.png" class="h-7 sm:h-10" />
					</div>
					<div class=flex-auto>
						<p class="text-4xl font-bold text-gray-900 ">Market Place</p>
					</div>
				</div>
				<h1 class="text-2xl text-center font-bold m-8">Search Result</h1>
				<table class="rounded-t-lg m-5 w-5/6 mx-auto bg-gray-200 text-gray-800">
					<thead>
						<tr class="text-left border-b-2 border-gray-300">
							<th class="px-4 py-3">Title</th>
							<th class="px-4 py-3">BasePrice</th>
							<th class="px-4 py-3">BestPrice</th>
							<th class="px-4 py-3">Wishlist</th>
						</tr>
					</thead>
					<tbody>
						<tr class="bg-gray-100 border-b border-gray-200">
							<td class="px-4 py-3"><c:out value="${results.title}" /></td>
							<td class="px-4 py-3"><c:out value="${results.basePrice}" /></td>
							<td class="px-4 py-3"><c:out value="${results.bestPrice}" /></td>
							<td class="px-4 py-3"><a href-"/marketsearch/wish/{barcode}"</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>