<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<link rel="stylesheet" href="https://mdbcdn.b-cdn.net/wp-content/themes/mdbootstrap4/docs-app/css/dist/mdb5/standard/core.min.css">
<link rel="stylesheet" id="roboto-subset.css-css" href="https://mdbcdn.b-cdn.net/wp-content/themes/mdbootstrap4/docs-app/css/mdb5/fonts/roboto-subset.css?ver=3.9.0-update.5" type="text/css" media="all">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <c:import url="../template/common_css.jsp"></c:import>

</head>
<body>
  <c:import url="../template/header.jsp"></c:import>
   <div class="container fluid my-5">
	<h1>member login</h1>
<section class="pb-4">
 	<div class="bg-white border rounded-5">
    
    <section class="w-100 p-4 d-flex justify-content-center pb-4">
      <form action="./memberLogin" method="post" style="width: 22rem;">
        <!-- id input -->
        <div class="form-outline mb-4">
          <input type="text" id="id" class="form-control" name="id">
          <label class="form-label" for="id"  style="margin-left: 0px;">ID</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88.8px;"></div><div class="form-notch-trailing"></div></div></div>

        <!-- Password input -->
        <div class="form-outline mb-4">
          <input type="password" id="pw" class="form-control" name="pw">
          <label class="form-label" for="form1Example2" style="margin-left: 0px;">Password</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 64.8px;"></div><div class="form-notch-trailing"></div></div></div>
	        <!-- Submit button -->
        <button type="submit" class="btn btn-primary btn-block">Login</button>
	
	
	</form>
	</section>
	</div>
	</section>
	</div>
<c:import url="../template/common_js.jsp"></c:import>
	
</body>
</html>