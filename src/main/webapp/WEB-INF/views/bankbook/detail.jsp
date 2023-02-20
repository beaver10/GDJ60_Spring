<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.iu.s1.bankbook.BankbookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty dto.bookNumber}">
			<h1>Bankbook Detail Page</h1>
			<h3>번호 : ${dto.bookNumber}</h3>
			<h3>상품명 : ${dto.bookName}</h3>
			<h3>이자율 : ${dto.bookRate}</h3>
			<h3>설명 : ${dto.bookDetail}</h3>
			<div>
				<c:if test="${not empty dto.bankbookImgDTO }">
					<img src="../resources/upload/bankbook/${dto.bankbookImgDTO.fileName }">
				</c:if>
			</div>
			<h3>판매여부 : 
			<c:choose>
				<c:when test="${dto.bookSale eq 1}">판매중</c:when>
				<c:otherwise>판매중단</c:otherwise>
			</c:choose>
			</h3>
		<br><br>
		<button><a href="./add">상품 등록</a></button>
		<button><a href="./delete?bookNumber=${dto.bookNumber}">상품 삭제</a></button>
		</c:when>
		<c:otherwise><h2>존재하지 않는 상품입니다.</h2></c:otherwise>
	</c:choose>
		<button><a href="./update?bookNumber=${dto.bookNumber}">상품수정</a></button>
		<button><a href="./list">리스트</a></button>
	
	</h3>
</body>
</html>