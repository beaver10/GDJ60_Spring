<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Add</h1>
	<div class="col-3">
		<form action="./productAdd" method="post">
			상품명 : <input type = "text" name="productName" value="test" ><br>
			상품정보 : <textarea name="productDetail" rows="" cols=""></textarea><br>
			상품평점 : <input type ="number" name="productJumsu" >
			<button type="submit">전송</button><br>
		
		</form>
	
	
	</div>
</body>
</html>