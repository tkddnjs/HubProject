<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
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
		<h1>회원가입</h1>
		<form action="../registerUser.do" method="post">
			<dl>
				<dt>
					ID<span> (*) </span>
				</dt>
				<dd>
					<input type="text" size="20" name="userid"
						class="validate required">
				</dd>
				<dt>
					PW<span> (*) </span>
				</dt>
				<dd>
					<input type="password" size="20" name="pw" class="validate pw">
				</dd>
				<dt>
					PW확인<span> (*) </span>
				</dt>
				<dd>
					<input type="password" size="20" name="pwcheck"
						class="validate pw pw_check">
				</dd>


				<dt>이메일</dt>
				<dd>
					<input type="text" size="50" name="email"
						class="validate mail mail_check">
				</dd>

				<dt>
					연결고리(직업, 취미 등 도움을 줄 수 있는 분야)<span> (*) 1개 이상 입력</span>
				</dt>
				<dd>
					<input type="text" size="10" name="connchain" class="validate">
					<button>+</button>
				</dd>
				<dt>도움 리스트 조회 여부</dt>
				<dd class="checkboxRequired">
					<label for="toU">내가<input type="checkbox"  name="listoption"  checked=''  value="1"/></label>
					<label for="toMe">나를<input type="checkbox"  name="listoption" checked=''  value="2"/></label>
				</dd>

				<dt>
					자기소개<span>2000byte</span>
				</dt>
				<dd>
					<textarea name="introduce" rows="13" cols="63" class=""></textarea>
				</dd>
			</dl>
			<p>
				<input type="submit" value="가입">
			</p>
		</form>
	</div>
	<script>
    $("form").submit(function(){
        //에러 초기화 추가로 붙는 내용 삭제
        $("p.error").remove();
        $("dl dd").removeClass("error");
        
        //filter메소드를 이용해서 text, textareea 요소들 중에 validate
        //클래스를 같고 있는 것만 찾는다.
        $(":text, textarea").filter(".validate").each(function(){
            
            //필수 항목 검사
            //this -> filter로 걸러진 text, textarea 중에 하나를 뜻한다.
            $(this).filter(".required").each(function(){
                if($(this).val() == ""){
                    $(this).before("<p class='error'>필수 항목 입니다.</p>");
                }
            });
            
            
            
            //연락처 검사
            $(this).filter(".number").each(function(){
                if(isNaN($(this).val())){
                    $(this).before("<p class='error'>숫자만 입력 가능합니다.</p>");
                }
            });
            
            
            
            $(document).ready(function() {
        		
        		$("#id").keyup(function() {
      				
        				var id= $(this).val();
        				$.ajax({
        					type: 'POST', 
        					url: 'checkId.do',
        					data: 
        						{
        							id: id
        							//앞의 id: getParameter할 것 / 뒤 id: 위의 var id= 값
        						},
        					success: function(result){
        						if($.trim(result) == "ok"){
        							$("#idCheckResult").html("사용가능한 ID입니다.");
        						}else{
        							$("#idCheckResult").html("사용중인  ID입니다.");
        						}
        					
        				});
        			})
        		});
            
            // 메일 검사
            $(this).filter(".mail").each(function(){
                if($(this).val()&&!$(this).val().match(/.+@.+\..+/g)){
                    $(this).before("<p class='error'>메일 형식이 잘못되었습니다.</p>");
                }
            });
            
        });
        
        
        //radio button check
        $(":radio").filter(".validate").each(function(){
            $(this).filter(".required").each(function(){
                if($(":radio[name=" + $(this).attr("name")+"]:checked").length == 0){
                    $(this).before("<p class='error'>필수 선택 항목입니다.</p>");
                }
            })
        });
        
        
        //check box check
        $(".checkboxRequired").each(function(){
            if($(":checkbox:checked", this).length == 0){
                $(this).prepend("<p class='error'>필수 선택 항목입니다.</p>");
            }
        });
            
            
        
        if($("p.error").length> 0){
            //에러가 발생한 위치로 스크롤 이동
            $("html, body").animate({scrollTop : 
            $("p.error.first").offset.top - 40}, "slow");
            //에러 항목에 대한 음영 처리
            $("p.error").parent().addClass("error");
            return false;
        }
    });
    
    
    
    
    
    
    
    </script>
</body>
</html>