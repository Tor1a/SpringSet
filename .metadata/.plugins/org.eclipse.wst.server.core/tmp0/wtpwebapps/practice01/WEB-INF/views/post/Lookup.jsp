<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../include/header.jsp"%>

<script src="${pageContext.request.contextPath}/resources/js/post/commentAdd.js"></script>
<table>
	<thead>
		<tr>
			<td><h2>게시물 조회</h2></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>제목: ${vo.subject}</td>
		</tr>
		<tr>
			<td>작성자: ${vo.writer}</td>
			<td>작성일: ${vo.date}</td>
		</tr>
		<tr>
			<td>${vo.content}</td>
		</tr>
		<tr>
			<td>댓글 조회</td>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.writer} / ${list.content} / ${list.date} / <a
					href="CommentDel.do?idx=${list.bidx}&bidx=${vo.idx}">삭제</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	
	<form id="commentAddForm">
		<table>
		<tbody>
		<tr><td><input type="hidden" name="bidx" value="${vo.idx}"></td></tr> 
		
		<tr>
			<td>작성자: <input type="text" id="cmWriter" name="writer"placeholder="작성자를 입력해주세요"></td>
			<td><input type="text" id="cmContent" name="content" placeholder="내용을 입력해주세요"></td>
			<td><input type="button" value="작성" onclick="addCheck()"></td>
		</tr>
		</tbody>
	</table>
	</form>
</table>

	<button type="button" onclick="home()">목록</button>
	<button type="button" onclick="update(${vo.idx})">수정</button>
	<button type="button" onclick="delete1(${vo.idx})">삭제</button>
<script>
idx1 = '${vo.idx}';
console.log(" idx11 : " + '${vo.idx}');
</script>

<%@ include file="../include/footer.jsp"%>