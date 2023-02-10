<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bankbook Update Page</h1>
	<h3>
	<form action="./update" method="post">
	<input type="hidden" name="bookNumber" readonly value="${dto.bookNumber}"> <br>
	상품명 : <input type="text" name="bookName" value="${dto.bookName}"> <br>
	이자율 : <input type="text" name="bookRate" value="${dto.bookRate }"> <br>
	설명 : <textarea rows="" cols="" name="bookDetail">${dto.bookDetail }</textarea><br>
	판매여부 : <input type="text" name="bookSale" value="${dto.bookSale }"><br>
	<br><input type="submit" value="수정">
	</form>
	</h3>
	
	
</body>
</html>