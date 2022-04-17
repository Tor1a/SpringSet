<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../include/header.jsp" %>

<form id="money" action="money.do" method="GET">
	<table style="border: solid 1px;">
	<thead>
	<tr>
		<td>회원번호</td>
		<td>회원성명</td>
		<td>고객등급</td>
		<td>매출</td>
		</tr>
	</thead>
		<tbody>
		<c:forEach var="vo" items="${memberList}">
		<tr>
			<td>${vo.custno}</td>
			<td>${vo.custname}</td>
			<td>${vo.grade}</td>
			<td>${vo.money}</td>
		</tr>	
		</c:forEach>					
		</tbody>
	</table>
	</form>
</body>
</html>