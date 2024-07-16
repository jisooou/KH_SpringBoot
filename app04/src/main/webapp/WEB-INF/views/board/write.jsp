<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로월드</title>


</head>
<body>

   <h1>게시글 작성.</h1>

   <form action="/board/insert" method="POST" enctype= "multipart/form-data">
        제목 : <input type="text" name="title">
        <br /><br />
        내용 : <textarea name="content"></textarea>
        <br /><br />
        파일 : <input type="file" name="attachmentList" multiple accept=".jpg">
        <br /><br />
        <input type="submit" value="작성하기">
   </form>

</body>
</html>