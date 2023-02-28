<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<title>Insert title here</title>
   <c:import url="../template/common_css.jsp"></c:import>

   <style>
    .redResult{
      color: red;
    }

    .blueResult{
      color: blue;
    }

   </style>



</head>
<body>
  <c:import url="../template/header.jsp"></c:import>
  
  <div class="container fluid my-5">
    <h1>member join</h1>
    <section class="pb-4">
      <div class="bg-white border rounded-5">
        
        <section class="w-100 p-4 d-flex justify-content-center pb-4">
          <form action="./memberJoin" method="post" style="width: 22rem;" id="form">
            <!-- id input -->
            <div class="form-outline mb-4">
              <label class="form-label" for="id"  style="margin-left: 0px;"  >ID</label>
              <input type="text" id="id" class="form-control" name="id">
              <div id="idError" class="redResult"></div>
              <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88.8px;"></div><div class="form-notch-trailing"></div></div></div>
              
              <!-- Password input -->
              <div class="form-outline mb-4">
                <label class="form-label" for="form1Example2" style="margin-left: 0px;" >Password</label>
                <input type="password" id="pw" class="form-control" name="pw">
                <div id="pwError" class="redResult"></div>
                <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 64.8px;"></div><div class="form-notch-trailing"></div></div></div>
                
                <!-- Password input -->
                <div class="form-outline mb-4">
                  <label class="form-label" for="form1Example2" style="margin-left: 0px;">Password 확인</label>
                  <input type="password" id="pw2" class="form-control" name="pw2">
                  <div id="pw2Error" class="redResult"></div>
                  <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 64.8px;"></div><div class="form-notch-trailing"></div></div></div>
                  
                  <!-- Name input -->
                  <div class="form-outline mb-4">
                  <label class="form-label" for="memberName"  style="margin-left: 0px;">Name</label>
                  <input type="text" id="memberName" class="form-control" name="memberName">
                  <div id="nameError" class="redResult"></div>
                  <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88.8px;"></div><div class="form-notch-trailing"></div></div></div>
            
                  <!-- Phone input -->
                  <div class="form-outline mb-4">
                    <label class="form-label" for="memberPhone"  style="margin-left: 0px;">Phone</label>
                  <input type="text" id="memberPhone" class="form-control" name="memberPhone">
                  <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88.8px;"></div><div class="form-notch-trailing"></div></div></div>
              
              
                  <!-- Email input -->
                  <div class="form-outline mb-4">
                  <label class="form-label" for="email"  style="margin-left: 0px;">Email</label>
                  <input type="email" id="email" class="form-control" name="email">
                  <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88.8px;"></div><div class="form-notch-trailing"></div></div></div>
                
                
                <!-- Submit button -->
                <button type="submit" class="btn btn-primary btn-block" id="btn">Join in</button>
              </form>
            </section>
          </div>
        </section>
      </div>
      
      <c:import url="../template/common_js.jsp"></c:import>
      
      <script src="../../../resources/js/memberJoin.js"></script>
    </body>
    </html>