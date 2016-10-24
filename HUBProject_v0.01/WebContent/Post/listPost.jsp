<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쪽지 목록</title>
<link href="resources/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/bootstrap-ko.css" rel="stylsheet">
<link href="resources/css/bootstrap-ko.min.css" rel="stylsheet">
<link href="resources/css/bootstrap-responsive.css" rel="stylsheet">
<link href="resources/css/bootstrap-responsive.min.css" rel="stylsheet">
<link href="resources/css/bootstrap.css" rel="stylsheet">
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<style type="text/css">

html, body {overflow: hidden;}

body {
	padding: 5px;
}

h1 {
	font-weight: bold;
	color: #A0B0DB;
	size: 50px;
}

.header {
	font-size: 15px;
}
</style>

<script type="text/javascript">
	function windowOpen() {
		window.open("./sendPost.jsp","subPopup","menubar=no,toolbar=no,location=no,status=no,fullscreen=no,width=400px,height=400px");
	}
	function allCk(objCheck){ //전체 선택 checkbox 클릭
	  var checks = document.getElementsByName("cp_no");
	  for( var i = 0; i < checks.length; i++ ){
	   checks[i].checked = objCheck; 
	// name이 'cp_no' 인 checkbox는  id가 allck인 checkbox의 checked 상태와 같게 된다. 

	  }
	 }

	function deleteGo(){ //여러 게시물을 선택하고 삭제하기
	  var removePost = document.getElementById("removePost");
	  removePost.action = "removePost.do?id=${postId}";
	  removePost.submit();
	 }
</script>

</head>
<body>
	<div class="header" align="right">
		<%@ include file="../header/header.jspf"%>
	</div>

	<h1 align="center">HUB : Have U get a BucketList?</h1>

	<div class="input-append pull-right">
		<form action="removePost.do" method="get" class="form-inline">
			<button class="btn btn-mini btn-primary"
				type="button">삭제</button>
		</form>
	</div>
	<div class="input-append pull-right">
		<button class="btn btn-mini btn-primary" type=button value='쪽지' onClick="windowOpen()">쪽지</button>
	</div>
	
	<form action=listPost.do method="post">
		<table class="table table-hover table-condensed table-striped">
			<thead style="background: #60d7a9;">
				<tr style="align: center;">
					<th>Post ID</th>
					<th>친구ID</th>
					<th>쪽지 종류</th>
					<th>일시</th>
					<th>내용</th>
				</tr>
			</thead>



			<tbody>
				<c:forEach items="${post }" var="post" varStatus="status">
					<tr>
						<c:choose>
							<c:when test="${userId eq post.senderId}">
								<input type="checkbox" id="allck" name="allck"  onclick="allCk(this.checked);">
									<% 
									int vectorSize = 5;
									for( int i=0; i<vectorSize; i++ ){
									%>
									<input type="checkbox" name="cp_no" value="<%=(i+1)%>">
									<%
									}
									%>
									<input type="button" class="btn btn-mini btn-primary" onclick="deleteGo(); return false;">삭제
								<td>${post.receiverId }</td>
								<td><font size="1">보낸 쪽지</font></td>
								<td>${post.transDT }</td>
								<td><span class="spanTitle">${post.content }</span> <a
									class="btn pull-right"
									href="sendPost.do?id=${post.receiverId }"><b>i</b></a></td>
							</c:when>
							<c:when test="${userId eq post.receiverId}">
								<td class="ranking">${post.postId }</td>
								<td>${post.senderId }</td>
								<td><font size="1">받은 쪽지</font></td>
								<td>${post.transDT }</td>
								<td><span class="spanTitle">${post.content }</span></td>
								<td><a class="btn pull-right"
									href="sendPost.do?id=${post.receiverId }"><b>i</b></a></td>
							</c:when>
						</c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>

	<div>
		<div class="pagination" align="center">
			<ul>
				<li><a href="#">Prev</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">6</a></li>
				<li><a href="#">7</a></li>
				<li><a href="#">8</a></li>
				<li><a href="#">9</a></li>
				<li><a href="#">10</a></li>
				<li><a href="#">Next</a></li>
			</ul>
		</div>


	</div>
</body>
</html>
