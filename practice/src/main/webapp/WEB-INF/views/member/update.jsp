<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../include/header.jsp" %>
	
<script src="${pageContext.request.contextPath}/resources/js/member/update.js"></script>
	
	
	<form name="updateForm">
	<table style="border: solid 1px;">
            <tr>
                <td >회원번호</td>
                 <td>
                 <input type="text" name="custno" id="custno" value="${vo.custno}" readonly="readonly">
                 </td>
            </tr>
             
            <tr>
                <td>회원성명</td>
                <td><input type="text" name="custname" id="custname" value="${vo.custname}"></td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td><input onKeyup="this.value=this.value.replace(/[^0-9]/g,'');" placeholder="010-1234-5678" type="text" name="phone" id="phone"  value="${vo.phone}" size="12"></td>
            </tr>
            <tr>
                <td>회원주소</td>
                <td><input type="text" name="address" id="address"  value="${vo.address}"></td>

            </tr>
            <tr>
                <td>가입일자</td>
                <td id="dateString"><fmt:formatDate pattern="yyyy-MM-dd" value="${vo.joindate}"  /></td>
            </tr>
            <tr>
                <td>고객등급[A:VIP,B:일반,C:직원]</td>
                <td><input type="text" name="grade" id="grade"  value="${vo.grade}"></td>
            </tr>
            <tr>
                <td>도시코드</td>
                <td><input type="text" name ="city" id="city"  value="${vo.city}"></td>
            </tr>
        </table> 
                
        </form>
       <input type="button" value="수정" onclick="updateCheck()">
         <button onclick="history.go(-1);">취소</button> 
</body>
</html>