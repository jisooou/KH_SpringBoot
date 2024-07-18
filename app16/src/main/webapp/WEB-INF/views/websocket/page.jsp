<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채팅</title>

</head>
<body>

   <h1>chat</h1>

   <form onsubmit="return false;">
       <input type="text" id="msg">
       <button type="submit" onclick="f01();">메세지 전송</button>
   </form>

   <div id="chat-area"></div>

</body>
</html>

<script>

    const socket = new WebSocket("ws://192.168.40.44:8080/chat");
    socket.onopen = function(){ console.log("open~~ !!") };
    socket.onmessage = function(evt){
        const chatArea = document.querySelector("#chat-area");
        chatArea.innerHTML += '<h3>' + evt.data + '<h3>';
    };

    function f01(){
        const inputTag = document.querySelector("#msg");
        socket.send(inputTag.value);
        inputTag.value = "";
    }


</script>