<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>Insert title here</title>
</head>
<body>

<h1>회원목록</h1>

<c:forEach var="vo" items="${list}">
	<c:out value="${vo.memId}" /> 
</c:forEach>

</body>
</html>
		
    
