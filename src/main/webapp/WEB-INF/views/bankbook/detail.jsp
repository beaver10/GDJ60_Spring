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
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>

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
				<button type="button" class="btn btn-primary" id="replyAdd" data-book-bookNumber="${dto.bookNumber}">댓글작성</button>
			</div>
		</form>
		</div>
	</div>

  
  <!-- Modal -->
  <div class="modal fade" id="contentsModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
	  <div class="modal-content">
		<div class="modal-header">
		  <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
		  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
		</div>
		<div class="modal-body">
			<div class="form-floating">
				<textarea class="form-control" placeholder="Leave a comment here" id="contents"></textarea>
				<label for="contents">Comments</label>
			</div>
		</div>
		<div class="modal-footer">
		  <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" id="closeModal">Close</button>
		  <button type="button" class="btn btn-primary" data-comment-num="" id="contentsConfirm">확인</button>
		</div>
	  </div>
	</div>
  </div>

  
<!-- Test후 삭제할 영역 -->
<!-- <div class="my-5">
	<button type="button" id="b1">BUTTON1</button>
	<input type ="text" id="t1">
	<div class = "my-5">
	   <input type="checkbox" id="" class="ch" name="ch" value="v1">
	   <input type="checkbox" id="" class="ch" name="ch" value="v2">
	   <input type="checkbox" id="" class="ch" name="ch" value="v3">
	   <input type="checkbox" id="" class="ch" name="ch" value="v4">
	</div>
 </div> -->
 
 
 

<c:import url="../template/common_js.jsp"></c:import>
<script src="/resources/js/bankbookReply.js"></script>
</body>
</html>