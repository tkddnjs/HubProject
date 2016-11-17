<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>버킷수정</title>

<script type="text/javascript" src="../resources/js/jquery.min.js"></script>


<style>
#container {
	width: 600px;
	margin: 0 auto;
	padding: 20px;
}

h1 {
	font-size: large;
}

dl dt {
	border-left: 5px solid #6699CC;
	font-size: small;
	padding: 5px;
}

dl dt span {
	color: red;
	font-weight: bold;
}

dl dd {
	font-size: small;
	margin: 0;
	padding: 10px;
}

dl dd input {
	position: relative;
	z-index: 2;
}

dl dd label {
	position: relative;
	padding: 5px 5px 5px 25px;
	margin: 0 5px 0 -25px;
	margin-left: -25px;
	position: relative;
	z-index: 1;
}
/*	경고에 대한 style
	jQuery에서 사용*/
dl dd.error input, dl dd.error textarea, dl dd.error label {
	background: #CCFFFF;
}

dl dd p.error {
	margin: 0;
	color: red;
	font-weight: bold;
	margin-bottom: 1em;
}
</style>

</head>
<body>

	<div id="container">
		<h1>버킷수정</h1>
		<form action="bucketlist/modify.do" method="post">
			<dl>
				<dt>
					제목<span> (*) </span>
				</dt>
				<dd>
					<input type="text" size="40" id="title" name="title"
						class="validate required"  value="${bucketlist.title }" >
				</dd>

				<dt>목표기간</dt>
				<dd>
					<input type="text" size="40" id="goal" name="goal"  value="${bucketlist.goal }" >
				</dd>

				<dt>
					중요도<span> 10점 만점 </span>
				</dt>
				<dd>
					<input type="number" size="40" id="star" name="star"  value="${bucketlist.star }" >
				</dd>

				<dt>
					연결고리 (버킷과 관련된 분야 - 도움을 받을 수 있습니다.)<span> (*) 1개 이상 입력</span>
				</dt>
				<dd id="connForm">
					<input type="text" size="10" name="connchain" class="validate"  value="" >
					<button type="button">+</button>
					<br>
				</dd>

				<dt>
					SOS (다른사람에게 도움받고 싶은 부분을 써주세요)<span>200byte</span>
				</dt>
				<dd>
					<input type="text" size="50" id="sos" name="sos"  value="${bucketlist.sos }" >
				</dd>

				<dt>
					메모<span>500byte</span>
				</dt>
				<dd>
					<textarea name="memo" rows="13"  cols="63"  class="" >${bucketlist.memo }</textarea>
				</dd>
				
			</dl>
			<p>
				<input type="hidden"  name="bucketId"  value="${bucketlist.bucketlistId }">
				<button type="submit" >수정완료</button>
			</p>
		</form>
	</div>

	<script>
		$(document)
				.ready(
						function a() {
							$("button")
									.click(
											function() {
												$(
														'<input type="text" size="10" name="connchain" class="validate"><br>')
														.appendTo("#connForm");
											});
						});

		$("form").submit(function() {
			//에러 초기화 추가로 붙는 내용 삭제
			$("p.error").remove();
			$("dl dd").removeClass("error");

			//filter메소드를 이용해서 text, textareea 요소들 중에 validate
			//클래스를 같고 있는 것만 찾는다.
			$(":text, textarea").filter(".validate").each(function() {

				//필수 항목 검사
				//this -> filter로 걸러진 text, textarea 중에 하나를 뜻한다.
				$(this).filter(".required").each(function() {
					if ($(this).val() == "") {
						$(this).before("<p class='error'>필수 항목 입니다.</p>");
					}
				});

				$(this).filter(".number").each(function() {
					if (isNaN($(this).val())) {
						$(this).before("<p class='error'>숫자만 입력 가능합니다.</p>");
					}
				});

				if ($("p.error").length > 0) {
					//에러가 발생한 위치로 스크롤 이동
					$("html, body").animate({
						scrollTop : $("p.error.first").offset.top - 40
					}, "slow");
					//에러 항목에 대한 음영 처리
					$("p.error").parent().addClass("error");
					return false;
				}
			});
		});
	</script>
</body>
</html>