
package com.friends.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.bouncycastle.crypto.tls.UseSRTPData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.friends.dao.MyPeedMapper;
import com.friends.dto.FollowDTO;
import com.friends.dto.UserInfoDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
//	메인 페이지인 homePeed에서의 페이지 분기에 대한 컨트롤러 
public class HomeController {
	
private static final String UserInfoDTO = null;
	//	mybatis bean을 자동으로 SqlSession 인터페이스 타입의 객체에 넣어줌.
	@Autowired
	private SqlSession sqlSession;
	
//	이후, 로그인페이지가 index 페이지가 될 거임. 그때 수정.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
//	homePeed 페이지로 분기
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePeed() {
		log.info("homePeed() Method of HomeController class");
		return "/peed/homePeed";
	}
	
//	createPost 페이지로 분기
	@RequestMapping("/createPost")
	public String createPost() {
		log.info("followRequest() Method of HomeController class");
		return "/peed/createPost";
	}
	
//	followRequest 페이지로 분기
	@RequestMapping(value = "/followRequest", method = RequestMethod.GET)
	public String followRequest(HttpServletRequest request, Model model ) {
		log.info("followRequest() Method of HomeController class");
		
//		mapper를 얻어온다.
		MyPeedMapper mapper = sqlSession.getMapper(MyPeedMapper.class);
		
//		login 페이지가 없어 임시로 user1을 로그인 된 사용자로 함.
		String userId = "user1";
		
		ArrayList<FollowDTO> follow = mapper.selectByFollow(userId);
		System.out.println(follow.get(0).getFollow());
		model.addAttribute("followRequest", follow);
		
		return "/peed/followRequest";
	}
	
//	followList 페이지로 분기
	@RequestMapping(value = "/followList", method = RequestMethod.GET)
	public String followList(HttpServletRequest request, Model model) {
		log.info("followList() Method of HomeController class");
//		mapper를 얻어온다.
		MyPeedMapper mapper = sqlSession.getMapper(MyPeedMapper.class);
		
//		login 페이지가 없어 임시로 user1을 로그인 된 사용자로 함.
		String userId = "user1";
		
		ArrayList<FollowDTO> followList = mapper.selectByFollowList(userId);
		System.out.println(followList);
		model.addAttribute("followList", followList);
		return "/peed/followList";
	}
	
//	videos 페이지로 분기
	@RequestMapping(value = "/videoes", method = RequestMethod.GET)
	public String videos() {
		log.info("videos() Method of HomeController class");
		return "/peed/videoes";
	}
	
//	myPeed 페이지로 분기
	@RequestMapping(value = "/myPeed", method = RequestMethod.GET)
	public String myPeed() {
		log.info("myPeed() Method of HomeController class");
		return "/peed/myPeed";
	}
	
//	search 페이지로 분기
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search() {
		log.info("search() Method of HomeController class");
		return "/peed/search";
	}
	
//	chat 페이지로 분기
	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public String chat() {
		log.info("chat() Method of HomeController class");
		return "/chat/chat";
	}
	
	
	
	
}
