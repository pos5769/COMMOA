<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</head>
<body>

<div class="container">
<div class="row">
    <div class="col">
	<h1>회원등록</h1>
	<form action="${pageContext.request.contextPath}/join" method="post" > 
	  <div class="mb-3">
	    <label for="mngMemId" class="form-label">관리아이디</label>
	    <input type="text" name="mngMemId" class="form-control" id="mngMemId">
	  </div>
	  <div class="mb-3">
	    <label for="memId" class="form-label">아이디</label>
	    <input type="text" name="memId" class="form-control" id="memId">
	  </div>
	  <div class="mb-3">
	    <label for="memPassword" class="form-label">비밀번호</label>
	    <input type="password" name="memPassword" class="form-control" id="memPassword">
	  </div>
	  <div class="mb-3">
	    <label for="name" class="form-label">이름</label>
	    <input type="text" name="name" class="form-control" id="name">
	  </div>

	  <button type="submit" class="btn btn-primary"><i class="bi bi-save"></i> 저장</button>
	 	<a href="${pageContext.request.contextPath}/member/list.do">
			<button type="button" class="btn btn-outline-warning"><i class="bi bi-filter-square"></i> 회원목록</button>
		</a>
	</form>
	
	
	</div>
</div>
</div>


</body>
</html>
		
    
