<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로월드</title>

</head>
<body>
	<h1>홈페이지</h1>



    <c:if test="${ x != 'block' }">
        <h3> 검색창에 원드래곤!!! 구독 좋아요 알림설정 </h3>
    </c:if>

    <a href="/test">광고제거</a>

</body>
</html>