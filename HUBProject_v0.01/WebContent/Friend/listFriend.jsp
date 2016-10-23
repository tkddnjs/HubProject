<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>친구 목록</title>

<link href="/HUBProject_v0.01/resources/css/bootstrap-theme.min.css"
	rel="stylesheet">
<link href="/HUBProject_v0.01/resources/css/bootstrap.min.css"
	rel="stylesheet">
<!-- 
<link href="resources/css/bootstrap-ko.css" rel="stylsheet">
<link href="resources/css/bootstrap-ko.min.css" rel="stylsheet">
<link href="resources/css/bootstrap-responsive.css" rel="stylsheet">
<link href="resources/css/bootstrap-responsive.min.css" rel="stylsheet">
<link href="resources/css/bootstrap.css" rel="stylsheet">
 -->
<script src="/HUBProject_v0.01/resources/js/jquery.min.js"></script>

<!--
<script type="text/javascript">
	$(document).ready(function() {
		var autocomplete_text = [ "자동완성기능", "Autocomplete", "개발로짜", "국이" ];
		$("#searchs").autocomplete({
			source : autocomplete_text
		});
	});
</script>
 -->

<script src="/HUBProject_v0.01/resources/js/bootstrap.min.js"
	type="text/javascript"></script>

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

	<h1 align="center">HUB : Have U get a BucketList?</h1>

	<div class="input-append pull-right">
		<form action="/HUBProject_v0.01/listFriend.do" method="post"
			class="form-inline">
			<select class="ring" name="searchOpt">
				<option value="1">연결고리</option>
				<option value="2">관계</option>
			</select> <input class="span2" type="text" name="searchWord" id="searchs"
				data-source="typeahead" placeholder="검색어를 입력하세요">
			<button class="btn" type="submit">검색</button>
		</form>
	</div>

	<table class="table table-hover table-condensed">
		<thead style="background: #60d7a9;">
			<tr style="align: center;">
				<th width="20" align="center">NO</th>
				<th width="500" align="center">친구ID</th>
				<th width="500" align="center">관계</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${friends }" var="friend" varStatus="status">
				<c:if test="${friend.confirm }">
					<tr>
						<td>${status.count }</td>
						<td>
							<form action="/HUBProject_v0.01/userDetail.do" method="post">
								<button class="btn btn-xs btn-default btn-block" type="submit"
									name="userId" value="${friend.friendId }">${friend.friendId }</button>
								<input type="hidden" name="listOpt" value="${friend.relation }">
							</form>
						</td>
						<td><c:choose>
								<c:when test="${friend.relation eq 1}">
								내가 도움을 주는 관계							
							</c:when>
								<c:when test="${friend.relation eq 2}">
								내가 도움을 받는 관계
							</c:when>
								<c:otherwise>
								서로 도움을 주는 관계
							</c:otherwise>
							</c:choose></td>
					</tr>
				</c:if>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>