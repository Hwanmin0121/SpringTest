<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="wrap">
<h1>로그인 페이지</h1>
<hr>
<form action="/login/login.do" method="post">
	<label for="id">아이디:
	<input type="text" id="id" name="id"/></label><br>
	<label for="pw">패스워드
	<input type="text" id="pw" name="pw"/></label><br>
	<input type="submit" value="로그인"/>
</form>
</div>

</body>
</html>