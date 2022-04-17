<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

<script src="${pageContext.request.contextPath}/resources/js/member/join.js"></script>
<link src="${pageContext.request.contextPath }/resources/css/join.css">
 
<%@ include file="../include/header.jsp" %>

	 <form name="joinForm">
		 <table class="joTb">
            <tr>
                <td >회원번호</td>
                <td><input type="text" name="custno" value="${custno}" readonly="readonly"></td>
            </tr>
            <tr>
                <td>회원성명</td>
                <td><input type="text"  name="custname" id="custname"></td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td><input onKeyup="this.value=this.value.replace(/[^0-9]/g,'');" placeholder="ex)01012345678" type="text"name="phone" id="phone"></td>
            </tr>
            <tr>
                <td>회원주소</td>
                <td><input type="text" name="address" id="address"></td>
            </tr>
            <tr>
                <td>가입일자</td>
                 <td><input type="text" name="joindate" id="joindate"></td>
           </tr>
            <tr>
                <td>고객등급[A:VIP,B:일반,C:직원]</td>
                <td><input type="text" name="grade" id="grade"></td>
            </tr>
            <tr>
                <td>도시코드</td>
                <td><input type="text" name ="city" id="city"></td>
            </tr>
        </table> 
           <input type="button" value="등록"  onclick="joinCheck()">
           <button onclick="history.go(-1);">취소</button>
	</form>
			
        
	
	
	
   
</body>
</html>