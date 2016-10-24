<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도움리스트 목록</title>

<link href="/HUBProject_v0.01/resources/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/HUBProject_v0.01/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/bootstrap-ko.min.css" rel="stylsheet">
<link href="resources/css/bootstrap-responsive.min.css" rel="stylsheet">
<link href="resources/css/bootstrap.css" rel="stylsheet">

 
<script type="text/javascript"src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- <script type="text/javascript" src="/HUBProject_v0.01/resources/js/jquery.min.js"></script> -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript" src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		
		$("#listOpt").select(function name() {
			var availableTags = ${availableTags};	
		});
		
		
		$.ajax({
			type: 'POST',
			url: 'checkId.do',
			data:
				{
					id: id
				},
			success: function(result){
				if($.trim(result)=="ok"){
					$("#idCheckResult").html("사용가능한 ID입니다.");
				} else {
					$("#idCheckResult").html("사용중인 ID입니다.");
				}
			}
		});
		
		
		$("#form").append("<select class='ring' name='connChain' id='tags'>");
		for(var i=0; i<availableTags.length; i++){
			$("#tags").append("<option value='" + availableTags[i] + "'>" + availableTags[i] + "</option>");
		}
		$("#form").append("</select>");
		$("#form").append("<button class='btn' type='submit'>검색</button>");
		
		
//		$("#tags").autocomplete({
//			source: availableTags
//		});
	});
</script>

<script src="/HUBProject_v0.01/resources/js/bootstrap.min.js" type="text/javascript"></script>

<style type="text/css">
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

</head>
<body>
	<div class="header" align="right">
		<%@ include file="/header/header.jspf"%>
	</div>
	<div>
		<%@ include file="/menu.jsp"%>
	</div>
	
	<br>
	<div class="input-append pull-right">
		<form action="/HUBProject_v0.01/list.do" method="post" class="form-inline" id="form">
			<select class="ring" name="listOpt" id="listOpt">
				<option value="1">내가</option>
				<option value="2">나를</option>
				<option value="3">서로</option>
				<option value="4">업체</option>
			</select>

<!-- 			<input style="font-size:12pt;" class="span2" type="text" name="connChain" id="tags"
				data-source="typeahead" placeholder="연결고리를 입력하세요">
				<button class='btn' type='submit'>검색</button>
				
				 -->

		</form>
	</div>

	<table class="table table-hover table-condensed">
		<thead style="background: #60d7a9; color:white;">
			<tr style="align: center; font-size:14pt;">
				<th width="20" align="center">NO</th>
				<c:choose>
					<c:when test="${listOpt eq 1 or listOpt eq 3}">
						<th width="400" align="center">사용자ID</th>
						<th width="600" align="center">버킷리스트이름</th>
					</c:when>
					<c:when test="${listOpt eq 2}">
						<th width="400" align="center">사용자ID</th>
						<th width="600" align="center">연결고리목록</th>
					</c:when>
					<c:otherwise>
						<th width="400" align="center">업체이름</th>
						<th width="600" align="center">사이트</th>
					</c:otherwise>
				</c:choose>
			</tr>
		</thead>

		<tbody>
			<tr>
				<c:choose>
					<c:when test="${listOpt eq 1 or listOpt eq 3}">
						<c:forEach items="${bucketlists }" var="bucketlist" varStatus="status">
							<td>${status.count }</td>
							<td><a class="btn btn-xs btn-default btn-block"
								href="userDetail.do">${bucketlist.userId }</a></td>
							<td><a class="btn btn-xs btn-default btn-block"
								href="bucketlistDetail.do">${bucketlist.title }</a></td>

						</c:forEach>
					</c:when>
					<c:when test="${listOpt eq 2}">
						<c:forEach items="${users }" var="user" varStatus="status">
							<td>${status.count }</td>
							<td><a class="btn btn-xs btn-default btn-block"
								href="userDetail.do">${user.userId }</a></td>
							<td>${user.connChains }</td>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<c:forEach items="${coopers }" var="cooper" varStatus="status">
							<td>${status.count }</td>
							<td>${cooper.coName }</td>
							<td><a href="resources/img/${cooper.Banner }"></a></td>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tr>
		</tbody>
	</table>
</body>
</html>