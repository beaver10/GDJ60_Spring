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

<title>Insert title here</title>
   <c:import url="../template/common_css.jsp"></c:import>



</head>
<body>
  <c:import url="../template/header.jsp"></c:import>
   <div class="container fluid my-5">
	<h1>member join</h1>
	<section class="pb-4">
  <div class="bg-white border rounded-5">
    
    <section class="w-100 p-4 d-flex justify-content-center pb-4">
      <form action="./memberJoin" method="post" style="width: 22rem;">
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

 		<!-- Name input -->
		 <div class="form-outline mb-4">
          <input type="text" id="memberName" class="form-control" name="memberName">
          <label class="form-label" for="memberName"  style="margin-left: 0px;">Name</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88.8px;"></div><div class="form-notch-trailing"></div></div></div>
		
		 <!-- Phone input -->
 		<div class="form-outline mb-4">
          <input type="text" id="memberPhone" class="form-control" name="memberPhone">
          <label class="form-label" for="memberPhone"  style="margin-left: 0px;">Phone</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88.8px;"></div><div class="form-notch-trailing"></div></div></div>
			

		 <!-- Email input -->
 		<div class="form-outline mb-4">
          <input type="email" id="email" class="form-control" name="email">
          <label class="form-label" for="email"  style="margin-left: 0px;">Email</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88.8px;"></div><div class="form-notch-trailing"></div></div></div>
		
			
        <!-- 2 column grid layout for inline styling -->
<!--         <div class="row mb-4">
          <div class="col d-flex justify-content-center">
            Checkbox
            <div class="form-check">
              <input class="form-check-input" type="checkbox" value="" id="form1Example3" checked="">
              <label class="form-check-label" for="form1Example3"> Remember me </label>
            </div>
          </div>
        </div> -->

        <!-- Submit button -->
        <button type="submit" class="btn btn-primary btn-block">Join in</button>
      </form>
    </section>
    </div>
  </section>
  </div>

	<!-- <div class = "col-3">
	
		<form action="./memberJoin" method="post">
			아이디 : <input type="text" name="id"><br>
			비밀번호 : <input type="password" name="pw"><br>
			이름 : <input type="text" name="memberName"><br>
			핸드폰 번호 : <input type="text" name="memberPhone"><br>
			이메일 : <input type="email" name="email"><br>
			<button type="submit">전송</button><br>
		</form>
	</div> -->
<c:import url="../template/common_js.jsp"></c:import>
	
</body>
</html>