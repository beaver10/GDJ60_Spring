<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
	<h3>
	<a href = "./product/list?num=1&num=2&num=3">ProductList</a><br>
	<a href = "./member/memberJoin">MemberJoin</a><br>
	<a href = "/bankbook/list">Bankbook List 절대경로</a><br>
	<a href = "./bankbook/list">Bankbook List 상대경로</a><br>
	</h3>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
