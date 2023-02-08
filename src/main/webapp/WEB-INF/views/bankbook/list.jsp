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
	<h1>Bankbook List Page</h1>
	<table border="1">
		<thead>
			<tr>
				<th>상품명</th>
				<th>이자율</th>
				<th>판매여부</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td><a href="./detail?bookNumber=${dto.bookNumber}">${dto.bookName}</a> </td>
					<td>${pageScope.dto.bookRate}</td>
					<td>
						<c:choose>
							<c:when test="${dto.bookSale eq 1 }">판매중</c:when>
							<c:otherwise>판매중단</c:otherwise>
						</c:choose>
					
<!-- 					<c:if test="${dto.bookSale eq 1}">판매중</c:if>
						<c:if test="${dto.bookSale eq 0}">판매중단</c:if> 	
						-->
					</td>
				</tr>			
			</c:forEach>
		</tbody>
	</table>
	<br><br>
	<button><a href="./add">상품등록</a></button>
	
	
	
	
</body>
</html>