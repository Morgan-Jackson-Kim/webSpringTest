<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- jstl 코어 라이브러리 추가 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL CORE 라이브러리1</title>
</head>
<body>
	<h3>1.JSTL core 변수</h3>
	<c:set var="number1" value="36"/>
	<c:set var="number2">3</c:set>
	
	<div>첫번째 숫자 : ${number1 } </div>
	<div>두번째 숫자 : ${number2 } </div>
	
	<h3>2.JSTL core 연산</h3>
	<div>더하기 : ${number1 + number2 }</div>
	<div>빼기 : ${number1 - number2 }</div>
	<div>곱하기 : ${number1 * number2 }</div>
	<div>나누기 : ${number1 / number2 }</div>
	
	<h3>3.JSTL core out</h3>
	<c:out value="<title>core out</title>" escapeXml="true"></c:out>
	
	<h3>4.JSTL coreIf</h3>
	<c:if test="${(number1+number2)/2 >=10 }">
		<h1>${(number1+number2)/2 }</h1>
	</c:if>
	<c:if test="${(number1+number2)/2 < 10}">
		<h3>${(number1+number2)/2 }</h3>
	</c:if>
	
	<h3>5.JSTL core If</h3>
	<c:if test="${number1 * number2 > 100}">
		<c:out value="<script>alert('너무 큰 수 입니다.')</script>" escapeXml="false" />
	</c:if>
	
</body>
</html>