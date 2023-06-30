<%@ page language="java" contentType="text/html; charset=UTF-8"	    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>피드생성</title>
	<!-- css 파일 -->
	<link rel="stylesheet" href="css/simple_nav.css"/>
	<link rel="stylesheet" href="css/peed/createPost.css"/>
	<link rel="stylesheet" href="css/peed/createPost_preview.css"/>
	
</head>
<body>
	
	<!-- nav start -->
	<div class="nav " >		
		<div class="back_container">
			<a class="back" href="javascript:history.back()">◀ 게시물 만들기</a>
		</div>
	</div>
	<!-- nav end -->
	
	<!-- section start -->
	<div class="peed_bg">
		<div class="container">
			<form method="post" action="createPostOK" enctype="multipart/form-data" >
				<div class="tb_c_post">
					<div class="info_container">
						<div class="profile_container">
							<img alt="profile" src="img/icon/g_profile.png" class="profile">
						</div>
						<div class="info">
							<div>
								<span >username</span>
								<input type="hidden" name="username" value="user1">
							</div>
							<div>
								range of showing
							</div>
						</div>
					</div>
					<div class="textarea_container">
						<textarea 
							placeholder="username님, 무슨 생각을 하고 계신가요?" 
							style="resize: none; overflow: hidden;" name="text"></textarea>
					</div >
					<div class="tag">
						태그 추가시 여기 나옴
						<ul class="tag"></ul>
					</div>
					<div class="img_container">
						<img class="icon_upload_img" alt="add images" src="img/icon/add_img.png">
						<img class="icon_upload_video" alt="add a video" src="img/icon/add_video.png">
						<img class="icon_tag_someone" alt="tag someone" src="img/icon/add_tag.png" onclick="tagSomeone()">
					</div>
					<hr/>
					<div class="btn_container">
						<input class="btn" type="submit" value="게시"/>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- section end -->

	<script type="text/javascript" src="js/peed/createPost.js"></script>
	<script>
	</script>
	
</body>
</html>













