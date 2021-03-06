<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="../js/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/home.css">
<script src="${pageContext.request.contextPath}/resources/js/course/home.js"></script>

<title>수강신청 도우미 사이트</title>
</head>
<body>

	<div id="container">
	
		<h1 class="title">수강신청 도우미 사이트</h1>

		<div id="content">
			<h3 class="total">총 ${total}개의 수강신청이 있습니다</h3>
		
		<table class="liTb">
			<thead>
				<tr>
					<td>과목코드</td>
					<td>과목명</td>
					<td>학점</td>
					<td>담당강사</td>
					<td>요일</td>
					<td>시작시간</td>
					<td>종료시간</td>
					<td>관리</td>
				</tr>
			</thead>

			<c:forEach var="vo" items="${list}">
				<tr>
					<td>${vo.crId}</td>
					<td>${vo.crName}</td>
					<td>${vo.credit}</td>
					<td>${vo.lec_name}</td>
					<td>${vo.crWeek}</td>
					<td><c:if test="${vo.start_hour < 1000}">
							0${vo.start_hour}
						</c:if> <c:if test="${vo.start_hour >= 1000}">
							${vo.start_hour}
						</c:if></td>
					<td>${vo.end_end}</td>
					<td><a href="updateCourseForm.do?crId=${vo.crId}">수정</a> /<a href="deleteCourse.do?crId=${vo.crId}">삭제</a></td>
				</tr>
			</c:forEach>
		</table>
		<button class="add" onclick="add()">작성</button>
		</div>
	</div>



</body>
</html>