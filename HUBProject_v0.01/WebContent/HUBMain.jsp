<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> 로그인</title>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/style.css" rel="stylesheet">
	<style type="text/css">
		body {
			padding : 10% 10%;
		}
	</style>
</head>
<body>
	<a href="www.naver.com">네이버</a>
	<br>
	<h1> HUB : Have U get a BucketList? </h1>
	
	<br>
	<form action="login.do" method="post" >
		<table class="table">
			<tr>
				<th>ID</th>
				<td><input id="loginId"  name="loginId" class="form-control" type="text" value="" placeholder="ID를 입력해주세요."></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input id="password" name="password" class="form-control" type="password" value="" placeholder="비밀번호를 입력해주세요."></td>
			</tr>
		</table><br>
		<div align="center"><input class="btn" type="reset" value="취소"> <input class="btn btn-success" type="submit" value="로그인"></div>
	</form>
	<br>	
 
</body>
</html>