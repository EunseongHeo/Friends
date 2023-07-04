<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>follow</title>
<!-- css 파일 -->
<link rel="stylesheet" href="css/peed/follow.css">
<link rel="stylesheet" href="css/nav.css" />

<!-- js -->
<script type="text/javascript" src="js/code.jquery.com_jquery-3.7.0.min.js"></script>
<script type="text/javascript" src="js/peed/follow.js" defer="defer"></script>

</head>
<body>

	<!-- nav start -->
	<div class="nav ">
		<img class="nav_logo" src="img/icon/nav_logo.png" alt="Friends Logo" />
		<div class="">
			<a class="nav_icon " href="home"><img
				class="active_page_icon nav_icon  " src="img/icon/nav_home.png" /></a>
		</div>
		<div class="">
			<a class="nav_icon " href="followRequest"><img class="nav_icon "
				src="img/icon/nav_followList.png" /></a>
		</div>
		<div class="">
			<a class="nav_icon " href="videoes"><img class="nav_icon "
				src="img/icon/nav_vidoes.png" /></a>
		</div>
		<div class="">
			<a class="nav_icon " href="myPeed"><img class="nav_icon "
				src="img/icon/g_profile.png" /></a>
		</div>
		<div class="">
			<a class="nav_icon " href="search"><img class="nav_icon "
				src="img/icon/nav_search.png" /></a>
		</div>
		<div class="">
			<a class="nav_icon " href="chat"><img class="nav_icon "
				src="img/icon/nav_chat.png" /></a>
		</div>
	</div>
	<!-- nav end -->


	<!-- section start -->
	<div class="peed_bg">
		<div class="" style="height: 170px;">&nbsp;</div>
		<div style="margin-left: 30px;">
			<button class="myButton">
				request
			</button>
			&nbsp;&nbsp;
			<button class="myButton_2" onclick="location.href='followList';">
				follow
			</button>
		</div>
		<div style="margin: 50px 0px 0px 70px;">
			<table width="600px" border="0" cellpadding="5" cellspacing="0" >
				<c:forEach var="follow" items="${followRequest}" varStatus="status">
					<tr>
						<td width="70" height="70"> <img alt="" height="70px" src="img/icon/g_profile.png"> </td>
						<td width="300">${follow.userName}</td>
						<td>
							<%-- <input type="text" name="followName${status.index}" value="${follow.userName}"/> --%>
							<button class="btn_agr" type="button" onclick="followAgree('${follow.userName}')">수락</button>
							<button class="btn_agr2" type="button" onclick="followDelete('${follow.userName}')">삭제</button>
							<%-- <button type="button" name="userName" onclick="location.href='requestOk?${follow.userName}'" }>수락</button> --%>
							
						</td>
					</tr>
					
				</c:forEach>
				
			</table>
		</div>
		followRequest.jsp 입니다.
		
	</div>
</body>
</html>