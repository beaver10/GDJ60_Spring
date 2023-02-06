<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>member join</h1>
	<div class = "col-3">
		<form action="./memberJoin" method="post">
			아이디 : <input type="text" name="id"><br>
			비밀번호 : <input type="password" name="pw"><br>
			이름 : <input type="text" name="memberName"><br>
			핸드폰 번호 : <input type="text" name="memberPhone"><br>
			이메일 : <input type="email" name="email"><br>
			<button type="submit">전송</button><br>
		</form>
	</div>
	
</body>
</html>