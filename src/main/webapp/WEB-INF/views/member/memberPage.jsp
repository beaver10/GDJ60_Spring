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
   <div class="container fluid my-5">
	<h1>member page</h1>
	<section class="pb-4">
 	<div class="bg-white border rounded-5">
    
    <section class="w-100 p-4 d-flex justify-content-center pb-4">
			<form>
					<div class="form-group">
						<label>이름</label>
						<input type="text" class="form-control" value="${dto.memberName}">
					</div>
					<div class="form-group">
						<label>전화번호</label>
						<input type="text" class="form-control" value="${dto.memberPhone}">
					</div>
					<div class="form-group">
						<label>이메일</label>
						<input type="text" class="form-control" value="${dto.email}">
					</div>
					<br>
					<a href="./memberUpdate"  button type="submit" class="btn btn-primary">수정하기</a>
					
				</form>
		</section>
		</div>
		</section>
		</div>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<c:import url="../template/common_js.jsp"></c:import>
	
</body>
</html>