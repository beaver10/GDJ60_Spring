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
			<div class = "row">
				<nav aria-label="Page navigation example">
				  <ul class="pagination">
				    <li class="page-item ${pager.before? 'disabled' : '' } ">
				      <a class="page-link" href="./list?page=${pager.startNum-1 }&kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      </a>
				    </li>
				    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i" >
				    <li class="page-item"><a class="page-link" href="./list?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>				    
				    </c:forEach>
				    <li class="page-item ${pager.after eq false ? 'disabled':'' } ">
				
				      <a class="page-link" href="./list?page=${pager.lastNum+1 }&kind=${pager.kind}&search=${pager.search}"  aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				    </li>
				  </ul>
				</nav>
				<!-- for(int i = 1 ; i<=??; i++){i} -->
				<!--<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" step="1" var="i">
					<a href="./list?page=${i}"> ${i} </a>
				</c:forEach> -->
			</div>
			<!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 검색창 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@  -->
		<div>	
			<form class="row g-3" action="./list" method="get">
			  <div class="col-auto">
			    <label for="kind" class="visually-hidden">kind</label>
				<select class="form-select" name="kind" id="kind" aria-label="Default select example">
					<option value="title">상품명</option>
					<option value="contents">상품내용</option>


				  </select>
			  </div>
			  <div class="col-auto">
			    <label for="search" class="visually-hidden">Search</label>
			    <input type="text" class="form-control" name="search" id="search" placeholder="검색어를 입력하세요">
			  </div>
			  <div class="col-auto">
			    <button type="submit" class="btn btn-primary mb-3">검색</button>
			  </div>
			</form>
		</div>
			
		<a class="btn btn-danger" href="./productAdd">상품 등록</a>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>