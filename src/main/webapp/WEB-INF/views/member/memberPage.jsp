<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<link rel="stylesheet" href="https://mdbcdn.b-cdn.net/wp-content/themes/mdbootstrap4/docs-app/css/dist/mdb5/standard/core.min.css">
<link rel="stylesheet" id="roboto-subset.css-css" href="https://mdbcdn.b-cdn.net/wp-content/themes/mdbootstrap4/docs-app/css/mdb5/fonts/roboto-subset.css?ver=3.9.0-update.5" type="text/css" media="all">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>

</head>
<body>
  <c:import url="../template/header.jsp"></c:import>
     <div class="container-fluid">
     <div class="row">
		<h1>Member Page</h1>
	</div>
	<div class = "row">
		<h3>Name : ${member.memberName}</h3>
		<h3>Phone : ${member.memberPhone}</h3>
		<h3>Email : ${member.email} </h3>
		<a href="./memberUpdate" class = "btn btn-info">정보 수정</a>

	</div>
</div>
<c:import url="../template/common_js.jsp"></c:import>
	
</body>
</html>