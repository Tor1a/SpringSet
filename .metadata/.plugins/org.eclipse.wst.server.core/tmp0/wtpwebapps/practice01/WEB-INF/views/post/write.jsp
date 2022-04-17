<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>
<script src="${pageContext.request.contextPath}/resources/js/post/write.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/write.css">

<form id="writeForm">
<table class="wrTb">
  <thead>
   <tr><td>게시물 작성<td></tr>
  </thead>
 <tbody>
   <tr>
    <td>작성자</td>
    <td><input type="text" id="writer" name="writer"></td>
   </tr>
   
   <tr>
    <td>제목</td>
    <td><input type="text" id="subject" name="subject"></td>
   </tr>
   
   <tr>
    <td>내용</td>
    <td><input type="text" id="content" name="content" placeholder="내용을 입력해주세요"></td>
   </tr>
 </tbody>
</table>
</form>
    <input type="button" value="작성" onclick= "writeCheck()">   
    <button type="button" onclick="home()">목록</button>


<%@ include file="../include/footer.jsp" %>