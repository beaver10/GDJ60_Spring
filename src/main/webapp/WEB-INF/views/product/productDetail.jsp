<%@page import="com.iu.s1.product.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Detail</h1>
	<%ProductDTO productDTO = (ProductDTO) request.getAttribute("dto"); %>
	<h3><%= productDTO.getProductName() %></h3>
	<h3><%= productDTO.getProductDetail() %></h3>
	
	<hr>
	<!-- EL 방식 (앞으로 이렇게 작성)-->
	<h3>${requestScope.dto.productName}</h3>
	<h3>${dto.getProductDetail()}</h3>
	<h3>${dto.productScore*dto.productNum}</h3>
	<a class="btn btn-danger" href="./list">상품 목록</a>
</body>
</html>