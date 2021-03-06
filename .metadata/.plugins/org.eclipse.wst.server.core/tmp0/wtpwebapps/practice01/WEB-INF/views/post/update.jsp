<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp"%>
<script src="${pageContext.request.contextPath}/resources/js/post/update.js"></script>

<form id="updateForm">

	<table>
		<thead>
			<tr>
				<th>게시물 작성</th>
			</tr>
		</thead>
		<tbody>
			<tr><td><input type="hidden" name="idx" value="${vo.idx}"></td></tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" id="writer" name="writer" value="${vo.writer}"></td>
			</tr>

			<tr>
				<td>제목</td>
				<td><input type="text" id="subject" name="subject" value="${vo.subject}"></td>
			</tr>

			<tr>
				<td>내용</td>
				<td><input type="text" id="content" name="content" placeholder="내용을 입력해주세요"
					value="${vo.content}"></td>
			</tr>
		</tbody>
	</table>
	<input type="submit" value="수정완료" onclick= "updateCheck()">
</form>
<button onclick="history.go(-1);">취소</button>
<%@ include file="../include/footer.jsp"%>