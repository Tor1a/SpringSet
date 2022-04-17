<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="cpath" value="${pageContext.request.contextPath}"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="${cpath}/resources/js/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="${cpath}/resources/css/update.css">
<script src="${cpath}/resources/js/course/update.js"></script>
<title>수강신청 도우미 사이트</title>
</head>
<body>
	<header>
		<h3>수강신청 도우미 사이트</h3>
	</header>

	<h2>교과목 추가</h2>
	<form name="courseUpdate">
		<table class="upTb">
			<tr>
				<td>교과목 코드</td>
				<td><input type="text" id="crId" name="crId" value="${vo.crId}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>과목명</td>
				<td><input type="text" id="crName" name="crName"
					value="${vo.crName}"></td>
			</tr>
			<tr>
				<td>담당강사</td>
				<td><select id="lecturer" name="lecturer">
						<option value="0">담당강사를 선택해주세요</option>
						<c:forEach var="lcList" items="${lcList}">
							<option value="${lcList.idx}"
								<c:if test="${lcList.idx == vo.lecturer}">selected</c:if>>
								${lcList.crName}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>학점</td>
				<td><input type="text" id="credit" name="credit" value="${vo.credit}"></td>
			</tr>
			<tr>
				<td>요일</td>
				<td><c:forEach var="i" begin="1" end="6" varStatus="status">
						<input type="radio" value="${i}" id="week${i}" name="week"
							<c:if test="${vo.week == i}">checked</c:if> />
						<c:if test="${i==1}">월</c:if>
						<c:if test="${i==2}">화</c:if>
						<c:if test="${i==3}">수</c:if>
						<c:if test="${i==4}">목</c:if>
						<c:if test="${i==5}">금</c:if>
						<c:if test="${i==6}">토</c:if>
					</c:forEach></td>
			</tr>
			<tr>
				<td>시작</td>
				<td><input type="text" id="start_hour" name="start_hour"
					value="${vo.start_hour}"></td>
			</tr>
			<tr>
				<td>종료</td>
				<td><input type="text" id="end_end" name="end_end"
					value="${vo.end_end}"></td>
			</tr>
		</table>
		<input type="button" value="수정완료" onclick="updateCheck()">
		<button onclick="home()">목록</button>
		<button type="button" onclick="history.go(-1);">취소</button>
	</form>
</body>
</html>