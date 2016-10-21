<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HUB</title>

<link href="../resources/css/bootstrap.min.css" rel="stylesheet">
<link href="../resources/css/style.css" rel="stylesheet">

<style type="text/css">
body {
	padding: 50px;
}
h1 {
	font-weight:bold;
	color : #A0B0DB;
}
.ranking {
	text-align: center;
	font-size: 28pt;
}

.spanTitle {
	font-size: 18pt;
	font-weight: bold;
	margin-right: 10px;
}

.pAlbum {
	color: gray;
	margin-left: 5px;
}

.imgAlbum {
	width: 80px;
	height: 80px;
	margin-right: 10px;
}

.btnPlay {
	margin-top:40%
}

</style>
</head>
<body>
	<%@ include file = "../header/header.jspf" %>
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<h1>Music Chart</h1>
				
				<div align="right">
					<form action="search.do" method="post">
						<input type="text" placeholder="연결고리를 입력하세요." name="name">
						<input class="btn btn-xs btn-default" type="submit" value="검색">
					</form>
				</div>
				
				
				<table class="table table-hover table-condensed">
					<colgroup>
						<col width="80" align="center">
						<col width="*">
						<col width="70">
					</colgroup>
					<thead>
						<tr>
							<th>순위</th>
							<th>곡정보/곡명</th>
							<th>담기</th>
						</tr>
					</thead>
					
					<tbody>
						<c:forEach items="${musics }" var="music" varStatus="status">
							<tr>
	                            <td class="ranking">${music.id  }</td>
	                            <td>
	                            <table>
	                            <tr><td rowspan="2"><img class="imgAlbum" src="resources/img/${music.image  }" ></td>
	                            <td>
	                            	<span class="spanTitle">${music.name  }</span>
	                            	<a class="btn btn-xs btn-default" href="detail.do?id=${music.id}"><b>i</b></a>
	                            </td>
	                            </tr>
	                            <tr><td><p class="pAlbum">${music.artist  } - ${music.album  }</p></td></tr>
	                            </table>
	                            <td><a class="btn btn-xs btn-info btnPlay" href="myList.do?id=${music.id  }&userId=${userId }">담기</a></td>
	                        </tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>