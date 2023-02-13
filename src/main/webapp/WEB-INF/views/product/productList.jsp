<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
   <c:import url="../template/common_css.jsp"></c:import>
      <link rel="stylesheet" href="/resources/css/table.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
  <c:import url="../template/header.jsp"></c:import>
	<h1>Product List</h1>
	<div class="col-8">
	<table class="table table-hover">
		<thead>
			<tr>
				<th>상품번호</th><th>상품이름</th><th>상품평점</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="dto"> <!-- dtoList는 page영역에 담김 -->
				<tr>
					<td><a href="./detail?productNum=${dto.productNum}"> ${pageScope.dto.productNum}</a></td>	
					<td>${dto.productName}</td>
					<td>${dto.productScore}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<a class="btn btn-danger" href="./productAdd">상품 등록</a>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>