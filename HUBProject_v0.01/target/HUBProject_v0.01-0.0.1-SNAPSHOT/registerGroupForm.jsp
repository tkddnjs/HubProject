<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모임방 등록</title>

<link href="resources/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/bootstrap-ko.css" rel="stylsheet">
<link href="resources/css/bootstrap-ko.min.css" rel="stylsheet">
<link href="resources/css/bootstrap-responsive.css" rel="stylsheet">
<link href="resources/css/bootstrap-responsive.min.css" rel="stylsheet">
<link href="resources/css/bootstrap.css" rel="stylsheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
	
</script>

</head>
<body>

	<fieldset>
		<legend>모임방 등록</legend>
		<div>
			<form class="form-inline" action="registerGroup.do" method="post">
				<table>
					<tr>
					  <th>연결고리</th>
						<td><input type="text" placeholder="#태그를 입력해주세요(최대3개)"></td>
						<td><button type="button">추가</button></td>
					</tr>

					<tr>
					  <th>제 목</th>
						<td><input type="text" name="inputTitle"></td>
					</tr>


					<tr>
					  <th>마감일</th>
						<td><input type="date"></td>
					</tr>
					
					<tr>
					  <th>지 역</th>
						<td><select>
						  <option>선택</option>
						  <option>서울</option>
						  <option>경기</option>
						  <option>강원</option>
						  <option>경북</option>
						  <option>경남</option>
						  <option>대전</option>
                          <option>대구</option>
                          <option>부산</option>
                          <option>인천</option>
                          <option>울산</option>
                          <option>전북</option>
                          <option>전남</option>
                          <option>충북</option>
                          <option>충남</option>
						</select></td>
					</tr>
					
					<tr>
					  <th>소개</th>
						<td><textarea rows="3" style="width: 100%; height: 300px;"></textarea></td>
					</tr>		
					
				</table>
			</form>
		</div>
	</fieldset>



</body>
</html>