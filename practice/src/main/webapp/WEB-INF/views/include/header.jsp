<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script src="${pageContext.request.contextPath}/resources/js/jquery-3.6.0.min.js">
</script>

<title>쇼핑몰 회원 등록</title>
</head>
<body>
	<header>
    <h2 class="title">쇼핑몰 회원관리</h2>
    <div>
    <ul class="mainMenu">
        <li><a href="joinForm.do">회원등록</a></li>
        <li><a href="list.do">회원목록조회/수정</a></li>
        <li><a href="money.do">회원매출 조회</a></li>
        <li><a href="/controller">홈으로 </a></li>
    </ul>
</div>
</header>