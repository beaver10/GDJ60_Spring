<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bankbook Add Page</h1>
	<h3>
	<form action="./add" method="post">
		상품명 : <input type="text" name="bookName" placeholder="제품명 입력"> <br>
		이자율 : <input type="text" name="bookRate" value="1.5"> <br>
		설명 : <textarea rows="" cols="" name="bookDetail" placeholder="간단한 설명"></textarea><br>
		판매여부 : <input type="text" name="bookSale" value="1"><br>
	
		<button type="submit">등록</button>
		<button><a href="./list"> 리스트</a></button>
	</form>
	</h3>
</body>
</html>