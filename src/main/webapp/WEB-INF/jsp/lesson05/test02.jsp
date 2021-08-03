<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<title>JSTL Core 라이브러리e</title>
</head>
<body>
	
	
		<h3>HOT5</h3>
		<table class="table text-center" >
			<tr>
				<th>순위</th>
				<th>제목</th>
			</tr>
			
			<c:forEach var="music" items="${musicRanking }" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${music }</td>
			</tr>
			</c:forEach>
			
		</table>
		
		<br>
		<br>
		
		<h3>멤버십</h3>
		<table class="table text-center" >
			<tr>
				<th>이름</th>
				<th>전화번호</th>
				<th>등급</th>
				<th>포인트</th>
			</tr>
			
			<c:forEach var="member" items="${membership }" varStatus="status">
				<tr>
					<th>${member.name }</th>
					<th>${member.phoneNumber }</th>
					<c:choose>
						<c:when test="${member.grade eq 'VIP' }">
							<th class="text-danger">${member.grade }</th>
						</c:when>
						<c:when test="${member.grade eq 'GOLD' }">
							<th class="text-warning">${member.grade }</th>
						</c:when>
						<c:otherwise>
							<th>${member.grade }</th>
						</c:otherwise>
					</c:choose>
					
					<c:choose>
						<c:when test="${member.point >=5000 }">
							<th class="text-primary">${member.point }</th>
						</c:when>
						<c:otherwise>
							<th>${member.point }</th>
						</c:otherwise>
					</c:choose>
				</tr>
			</c:forEach>
		
		
		
		</table>
	
	
	

</body>
</html>