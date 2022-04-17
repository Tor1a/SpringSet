<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../include/header.jsp" %>
	
	<div class="total">
		<h2>총 ${total}개의 게시물이 있습니다.</h2>
	</div>
	
	<table style="border: solid 1px;">
		<thead>
		<tr>
			<td>회원번호</td>
			<td>회원성명</td>
			<td>전화번호</td>
			<td>주소</td>
			<td>가입일자</td>
			<td>고객등급</td>
			<td>거주지역</td>
			</tr>
		</thead>
		<c:forEach var="VO" items="${memberList}">
			<tr>
			<td><a href="updateForm.do?custno=${VO.custno}">${VO.custno}</a></td>
			<td>${VO.custname}</td>
			<td>${VO.phone}</td>
			<td>${VO.address}</td>
			<td>${VO.joindate}</td>
			<td> ${VO.grade}</td>
			<td>${VO.city}</td>
			</tr>
		</c:forEach>
	</table>
	

   
</body>
</html>