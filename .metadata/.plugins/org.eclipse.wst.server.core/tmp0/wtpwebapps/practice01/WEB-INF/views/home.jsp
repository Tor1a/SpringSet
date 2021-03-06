<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.6.0.min.js"></script>
<script	src="${pageContext.request.contextPath}/resources/js/post/home.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/home.css">

<title>커뮤니티</title>
</head>
<body>

	<h1 class="title">커뮤니티 사이트</h1>



	<div id="container">
		<h3 class="total">총 ${totalPost}개의 게시물이 있습니다</h3>

		<table class="tbList">
			<thead class="tbTitle">
				 <tr>   
				  <td>번호</td>
				  <td>작성자</td>
				  <td>제목</td>
				  <td>작성일</td>
				</tr>
				
			</thead>
			<tbody class="tbCnt">
				<c:forEach var="VO" items="${list}">
					<tr>
						<td><a href="lookUp.do?idx=${VO.idx}">${VO.idx}</a></td>
						<td>${VO.writer}</td>
						<td>${VO.subject}</td>
						<td><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss"
								value="${VO.date}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<button class="write" onclick="wirte()">작성</button>
	</div>
</body>
</html>