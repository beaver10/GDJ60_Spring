<%@page import="com.iu.s1.bankbook.BankbookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>

</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container-fluid">
	<div class="row">
		<form>
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
			<a href="./add" class="btn btn-primary">상품 등록</a>
			<a href="./delete?bookNumber=${dto.bookNumber}" class="btn btn-danger" >상품 삭제</a>
		</c:when>
		<c:otherwise><h2>존재하지 않는 상품입니다.</h2></c:otherwise>
	</c:choose>
	
		<a href="./update?bookNumber=${dto.bookNumber}" class="btn btn-outline-primary">상품수정</a>
		<a href="./list" class="btn btn-outline-primary">리스트</a>

		<div class="my-5" id="commentListResult">

		</div>

			<div class="mb-3">
				<textarea class="form-control" id="replyContent" rows="3" ></textarea>
			</div>
			<div class="mb-3">
				<button type="submit" class="btn btn-primary" id="replyAdd" data-book-bookNumber="${dto.bookNumber}">댓글작성</button>
			</div>
		</form>
		</div>
	</div>


<c:import url="../template/common_js.jsp"></c:import>
<script src="/resources/js/bankbookReply.js"></script>
</body>
</html>