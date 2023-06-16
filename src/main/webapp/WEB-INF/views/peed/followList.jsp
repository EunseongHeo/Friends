<%@ page language="java" contentType="text/html; charset=UTF-8"	    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>follow</title>
	<!-- css 파일 -->
	<link rel="stylesheet" href="css/nav.css"/>
</head>
<body>
	
	<!-- nav start -->
	<div class="nav " >		
		<img class="nav_logo" src="img/icon/nav_logo.png" alt="Friends Logo" />
		<div class="">
			<a class="nav_icon " href="home"><img class="active_page_icon nav_icon  " src="img/icon/nav_home.png"/></a>
		</div>
		<div class="">
			<a class="nav_icon " href="#"><img class="nav_icon " src="img/icon/nav_followList.png"/></a>
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
		<button><a href="followRequest">request</a></button>
		<button><a href="#">follow</a></button>
		followList.jsp 입니다.
	
	</div>
</body>
</html>