<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로월드</title>

</head>
<body>
   <h1>LOGIN ~ !</h1>

   <form action="/member/login" method="POST">
        <input type="text" name="id">
        <input type="password" name="pwd">
        <input type="submit" name="button" value="제출하기">
   </form>
</body>
</html>