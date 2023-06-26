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
		createPost.jsp 입니다.
		<div class="container">
			<form action="createPostOK">
				<table class="tb_c_post" >
					<tr>
						<td rowspan="2" colspan="1">
							<div class="profile_container">
								<img alt="profile" src="img/icon/g_profile.png" class="profile">
							</div>
						</td>
						<td>
							<span>
								username
							</span>
						</td>
						<td colspan="3">&nbsp;</td>
					</tr>
					<tr>
						<td>
							range of showing
						</td>
						<td colspan="3">&nbsp;</td>
					</tr>
					<tr>
						<td colspan="5">
							<div class="textarea_container">
								<textarea 
									placeholder="username님, 무슨 생각을 하고 계신가요?" 
									style="resize: none; overflow: hidden;"></textarea>
							</div>
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td >
							<div class="img_container">
								<img alt="add images" src="img/icon/add_img.png" onclick="add_imgs()">
								<img alt="add a video" src="img/icon/add_video.png" onclick="add_video()">
								<img alt="tag someone" src="img/icon/add_tag.png" onclick="tag_someone()">
							</div>
						</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td colspan="5" >
							<hr/>
							<div class="btn_container">
								<input class="btn" type="submit" value="게시"/>
							</div>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<!-- section end -->


	<script type="text/javascript">
		function add_imgs(){
			console.log('add images event.');
		}
		function add_video(){
			console.log('add a video event.');
		}
		function tag_someone(){
			console.log('tag someone event.');
		}
	</script>
</body>
</html>