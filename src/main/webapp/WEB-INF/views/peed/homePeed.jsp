<%@ page language="java" contentType="text/html; charset=UTF-8"	    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>

	<!-- css 파일 -->
	<link rel="stylesheet" href="css/nav.css"/>	<!-- navigatin css 파일 -->
	<link rel="stylesheet" href="css/peed/homePeed.css"/> <!-- homePeed css 파일 -->
	<link rel="stylesheet" href="css/peed/slide_img.css"/> <!-- slid_img css 파일 -->
	
</head>
<body>
	
	<!-- nav start -->
	<div class="nav " >		
		<img class="nav_logo" src="img/icon/nav_logo.png" alt="Friends Logo" />
		<div class="">
			<a class="nav_icon " href="#"><img class="active_page_icon nav_icon  " src="img/icon/nav_home.png"/></a>
		</div>
		<div class="">
			<a class="nav_icon " href="followRequest"><img class="nav_icon " src="img/icon/nav_followList.png"/></a>
		</div>
		<div class="">
			<a class="nav_icon " href="videoes"><img class="nav_icon " src="img/icon/nav_vidoes.png"/></a>
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
		<div class="peed_create"  onclick="location.href='createPost'">
			<div class="peed_create_container">
				<div class="profile">
					<img alt="profile" src="img/icon/g_profile.png">
				</div>
				<div class="peed_create_text">
					username님 오늘 하루는 어떠셨나요?
				</div>
			</div>
		</div>
		
	<!-- DB 데이터 양에 따라 반복될 코드 start -->
		<!-- 피드에 대한 코드 -->
		<div class="peed_body" >
			<div class="peed_content_info ">
				<!-- peed info 영역 -->
				<div class="peed_info_container">
					<div class="profile">
						<img alt="profile" src="img/icon/g_profile.png">
					</div>
					<div class="info">
						<div class="username">
							username
						</div>
						<div class="writeTime">
							write time
						</div>
					</div>
				</div>
			</div>
			<div class="peed_content_text">
				텍스트 영역
				<br/>
				<br/>
				<br/>
				<br/>
				a;lwekf;aoifd
				<br/>
				<br/>
				텍스트 영역
				<br/>
				텍스트 영역
				<br/>
				텍스트 영역
				<br/>
				텍스트 영역
			</div>
			
			<!-- 첨부된 파일이 있는 경우 사용되는 코드 -->
			<div class="peed_content_img img-box">
				<div class="wrapper">
					<a class="btn prevz" style="text-decoration: none; color: white;">&#10094;&nbsp;&nbsp;</a>
					<div class="container">
						<ul class="slider">
							<li class="item"><img src="img/icon/nav_logo.png">1</li>
							<li class="item"><img src="img/icon/nav_logo.png">2</li>
							<li class="item"><img src="img/icon/nav_logo.png">3</li>
						</ul>
					</div>
					<a class="btn next" style="text-decoration: none; color: white;">&nbsp;&nbsp;&#10095;</a>
				</div>
			</div>
<!-- 				이미지/영상 <br/><br/>
				텍스트 + 이미지 여러 장<br/> 
				또는 <br/>
				텍스트 + 영상 하나 <br/>
				의 형태로만 업로드 가능. -->
			
			
			<div class="">
				<img alt="좋아요 표시 영역" src="img/icon/p_heart.png" width="50px"> 2,256 좋아요
			</div>
			<div class="action_choose" >
				<div class="action_box" >
					<div class="action_container">
						<img class="action_img" alt="like" src="img/icon/g_heart.png">
						<div class="action">
							좋아요
						</div>
					</div>
				</div>
				<div class="action_box" >
					<div class="action_container">
						<img class="action_img" alt="reply" src="img/icon/g_reply.png">
						<div class="action">
							댓글달기
						</div>
					</div>
				</div>
				<div class="" >
					<div class="action_container">
						<img class="action_img" alt="share" src="img/icon/share.png">
						<div class="action">
							공유하기
						</div>
					</div>
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

	<!-- js파일 -->
	<script type="text/javascript" src="js/code.jquery.com_jquery-3.7.0.min.js"></script>
	<script type="text/javascript" src="js/peed/slide_img.js"></script>
	<script type="text/javascript">
		console.log("homePeed script tag");
		console.log("수정 필요. < 버튼 동작x 함수 수정 javascript");
	
		function create_post() {
			console.log("go to create post page");
		}
	</script>

</body>
</html>