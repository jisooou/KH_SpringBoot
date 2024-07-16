<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파이널</title>

</head>
<body>
   <h1>공지사항 작성하기</h1>

   <form action="/api/notice" method="post">
      <input type="text" name="title" placeholder="제목">
      <br>
      <textarea name="content" placeholder="내용"></textarea>
      <br>
      <input type="button" value="작성하기">
   </form>

   <button onclick="insertNotice();">ajax방식으로 insert 하기</button>

</body>
</html>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script>

    function insertNotice(){

      const titleValue = document.querySelector("input[name=title]").value;
      const contentValue = document.querySelector("textarea[name=content]").value;

      $.ajax( {
        url: "/api/notice",
        method: "post",
        data: {
          "title" : titleValue,
          "content" : contentValue,
        },
        success: function(x){
          console.log(x);
          alert(x);
          location.href="/notice/list";

          // if(x.status === "1"){
          //   location.href="/notice/list";
          // }else{
          //   location.href="/error-page";
          // }
        },
        error: function(){
          location.href="/error-page";
        },
      } );
    }

</script>