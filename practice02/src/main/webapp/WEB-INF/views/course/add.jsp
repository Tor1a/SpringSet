<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add.css">
<script src="${pageContext.request.contextPath}/resources/js/course/Add.js"></script>

<title>수강신청 도우미 사이트</title>
</head>
<body>
	<div id="wrapper">
		<header>
			<h3 class="title">수강신청 도우미 사이트</h3>
		</header>

		<h2>교과목 추가</h2>
		<form name="courseAddForm">
			<table class="adTb">
				<tr>
					<td>교과목 코드</td>
					<td><input type="text" id="crId" name="crId"></td>
				</tr>
				<tr>
					<td>과목명</td>
					<td><input type="text" id="crName" name="crName"></td>
				</tr>
				<tr>
					<td>담당강사</td>
					<td><select id="lecturer" name="lecturer">
							<option value="0">담당강사를 선택해주세요</option>
							<c:forEach var="lcList" items="${lcList}">
								<option value="${lcList.idx}">${lcList.crName}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>학점</td>
					<td><input type="text" id="credit" name="credit"></td>
				</tr>
				<tr>
					<td>요일</td>
					<td><c:forEach var="i" begin="1" end="6" varStatus="status">
							<input type="radio" value="${i}" id="week${i}" name="week" />
							<c:if test="${i==1}">월</c:if>
							<c:if test="${i==2}">화</c:if>
							<c:if test="${i==3}">수</c:if>
							<c:if test="${i==4}">목</c:if>
							<c:if test="${i==5}">금</c:if>
							<c:if test="${i==6}">토</c:if>
							<%-- 	 			  	 <c:if test="${i == 1 }"> --%>
							<%-- 	 			  	 	월<input type="radio" id="week${i}" name="week" checked /> --%>
							<%-- 	 			  	 </c:if> --%>
							<%-- 	 			  	 <c:if test="${i == 2 }"> --%>
							<%-- 	 			  	 	화<input type="radio" id="week${i}" name="week" /> --%>
							<%-- 	 			  	 </c:if> --%>
							<%-- 	 			  	  <c:if test="${i == 3 }"> --%>
							<%-- 	 			  	 	수<input type="radio" id="week${i}" name="week"  /> --%>
							<%-- 	 			  	 </c:if> --%>
							<%-- 	 			  	 <c:if test="${i == 4 }"> --%>
							<%-- 	 			  	 	목<input type="radio" id="week${i}" name="week" /> --%>
							<%-- 	 			  	 </c:if> --%>
							<%-- 	 			  	  <c:if test="${i == 5 }"> --%>
							<%-- 	 			  	 	금<input type="radio" id="week${i}" name="week"  /> --%>
							<%-- 	 			  	 </c:if> --%>
							<%-- 	 			  	 <c:if test="${i == 6 }"> --%>
							<%-- 	 			  	 	토<input type="radio" id="week${i}" name="week" /> --%>
							<%-- 	 			  	 </c:if> --%>
						</c:forEach></td>
				</tr>
				<tr>
					<td>시작</td>
					<td><input type="text" id="start_hour" name="start_hour"></td>
				</tr>
				<tr>
					<td>종료</td>
					<td><input type="text" id="end_end" name="end_end"></td>
				</tr>
			</table>
		</form>
			<input type="button" value="작성완료" onclick="addCheck()">
			<button type="button" onclick="home()">목록</button>
</div>
</body>
</html>