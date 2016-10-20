<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome HUB :  Have U get a BucketList?</title>
<link href="resources/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/bootstrap-ko.css" rel="stylsheet">
<link href="resources/css/bootstrap-ko.min.css" rel="stylsheet">
<link href="resources/css/bootstrap-responsive.css" rel="stylsheet">
<link href="resources/css/bootstrap-responsive.min.css" rel="stylsheet">
<link href="resources/css/bootstrap.css" rel="stylsheet">

<script type="text/javascript">

	
</script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>

<style>

.mainBody{
	top: 30%;

}


</style>

</head>
<body>
<a href=HUBMain.jsp><h1 align="center"  >HUB : Have U get a BucketList?</h1></a>
	<table align="center">
	
           <tr >
				<th>ID</th>
				<td>
					<input id="userId"  name="userId" class="form-control" type="text" value="" placeholder="ID를 입력해주세요.">
				</td>
				<th>Password</th>
				<td>
					<input id="password" name="password" class="form-control" type="password" value="" placeholder="비밀번호를 입력해주세요.">
				</td>
				<th><a class="btn btn-xs btn-info btnPlay" href="login.jsp" method="post">로그인</a></th>
				<th><a class="btn btn-xs btn-info btnPlay" href="registerUser.jsp" method="post" >회원가입</a></th>
			</tr>
		
		</table>
</body>
</html>
