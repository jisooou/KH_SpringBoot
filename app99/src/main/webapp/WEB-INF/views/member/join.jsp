<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로월드</title>

</head>
<body>
	<h1>회원가입 ~</h1>

  <form action="/member/join" method="post">
    <br>
    <input type="text" name="id">
    <br>
    <input type="password" name="pwd" placeholder="비밀번호 입력">
    <br>
    <input type="text" name="nick" placeholder="닉네임">
    <br>
    <input type="submit" value="회원가입">
  </form>
</body>
</html>