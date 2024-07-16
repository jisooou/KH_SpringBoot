<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로월드</title>

</head>
<body>
	<h1>HOME ~</h1>

	<h3>유저 정보 ::: ${loginMemberVo.nick}</h3>
	<c:if test="${not empty loginMemberVo}">
	    <button onclick="location.href='/member/quit?num=${loginMemberVo.no}'">탈퇴하기</button>
	</c:if>

</body>
</html>