<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>videos</title>
	<!-- css 파일 -->
	<link rel="stylesheet" href="css/nav.css"/>
	<link rel="stylesheet" href="css/homePeed.css"/>
</head>
<body>
	
	<!-- nav start -->
	<div class="nav " >		
		<img class="nav_logo" src="img/icon/nav_logo.png" alt="Friends Logo" />
		<div class="">
			<a class="nav_icon " href="home"><img class="active_page_icon nav_icon  " src="img/icon/nav_home.png"/></a>
		</div>
		<div class="">
			<a class="nav_icon " href="followRequest"><img class="nav_icon " src="img/icon/nav_followList.png"/></a>
		</div>
		<div class="">
			<a class="nav_icon " href="#"><img class="nav_icon " src="img/icon/nav_vidoes.png"/></a>
		</div>
		<div class="">
			<a class="nav_icon " href="myPeed"><img class="nav_icon " src="img/icon/g_profile.png"/></a>
		</div>
		<div class="">
			<a class="nav_icon " href="search"><img class="nav_icon " src="img/icon/nav_search.png"/></a>
		</div>
		<div class="">
			<a class="nav_icon " href="chat"><img class="nav_icon " src="img/icon/nav_chat.png"/></a>
		</div>
	</div>
	<!-- nav end -->
	
	
	<!-- section start -->
	<div class="peed_bg">
		<div class="" style="height: 140px">&nbsp;</div>
		<h1>videos.jsp 입니다.</h1>
	<!-- DB 데이터 양에 따라 반복될 코드 start -->
		<!-- 피드에 대한 코드 -->
		<div class="peed_body" >
			<div class="peed_content_info ">
				peed info 영역
			</div>
			<div class="peed_content_text">
				텍스트 영역
			</div>
			<div class="peed_content_img">
				이미지/영상 <br/><br/>
				텍스트 + 이미지 여러 장<br/> 
				또는 <br/>
				텍스트 + 영상 하나 <br/>
				의 형태로만 업로드 가능.
			</div>
			<div class="">
				<img alt="좋아요 표시 영역" src="img/icon/p_heart.png" width="50px"> 2,256 좋아요
			</div>
			<div class="action_choose" >
				<div class="action_like" >
					like
				</div>
				<div class="action_reply" >
					reply
				</div>
				<div class="action_share" >
					share 
				</div>
			</div>
		</div>
		<!-- 댓글에 대한 코드 -->
		<div class="comment_body">
			댓글 영역
			댓글이 없는 경우 생략됨.
		</div>
	<!-- DB 데이터 양에 따라 반복될 코드 end -->
		
		
	</div>
	<!-- section end -->

</body>
</html>