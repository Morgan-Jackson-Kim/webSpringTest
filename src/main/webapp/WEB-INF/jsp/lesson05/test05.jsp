<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<title>날씨 정보 페이지</title>

	<style type="text/css">
		.img-size{
			width: 150px
		}
	</style>
</head>
<body>
	<div class="container mt-5">
	
	<div class="d-flex">
	<jsp:include page="weatherNav.jsp"/>
	
	<section class="col-10 ml-5">
		<h3>과거날씨</h3>
		<table class="table text-center">
			<thead class="font-weight-bold">
				<tr>
					<th>날짜</th>
					<th>날씨</th>
					<th>기온</th>
					<th>강수량</th>
					<th>미세먼지</th>
					<th>풍속</th>
				</tr>
				
			</thead>
			<tbody>
				<c:forEach var="weather" items="${weatherHistory }" varStatus="status">
					<tr>
						
						<td><fmt:formatDate value="${weather.date }" pattern="yyyy년 M월 d일" /></td>
						<c:choose>
							<c:when test="${weather.weather eq '맑음' }">
								<td> <img alt="맑음" src="http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg"> </td>
							</c:when>
							<c:when test="${weather.weather eq '구름조금' }">
								<td> <img alt="구름조금" src="http://marondal.com/material/images/dulumary/web/jstl/partlyCloudy.jpg"> </td>
							</c:when>
							<c:when test="${weather.weather eq '흐림' }">
								<td> <img alt="흐림" src="http://marondal.com/material/images/dulumary/web/jstl/cloudy.jpg"> </td>
							</c:when>
							<c:when test="${weather.weather eq '비' }">
								<td> <img alt="비" src="http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg"> </td>
							</c:when>
						</c:choose>
						<td>${weather.temperatures }°C</td>
						<td>${weather.precipitation }mm</td>
						<td>${weather.microDust }</td>
						<td>${weather.windSpeed }km/h</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
	</div>
	
	<jsp:include page="weatherFotter.jsp"/>
	</div>


</body>
</html>