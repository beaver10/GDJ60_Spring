<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
	<h1>member List</h1>
	<div class = "col-8">
	<table class = "table table-hover">
		<thead>
			<tr>
				<th>멤버 ID</th><th>멤버 이름</th><th>멤버 이메일</th>
			</tr>	
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.memberId}</td>
					<td>${dto.memberName}</td>
					<td>${dto.memberEmail}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	</div>
</body>
</html>