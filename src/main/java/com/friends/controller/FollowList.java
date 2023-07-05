package com.friends.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.friends.dao.MyPeedMapper;
import com.friends.dto.FollowDTO;

import lombok.extern.slf4j.Slf4j;
import oracle.net.aso.s;

@Slf4j
@Controller
public class FollowList {
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/requestOk")
	public String requestOk(HttpServletRequest request, Model model, @RequestParam("name") String name, FollowDTO f_DTO){
		System.out.println("follow����");
		log.info("follow ����");
		System.out.println(name);
		
//		login �������� ���� �ӽ÷� user1�� �α��� �� ����ڷ� ��.
		String userId = "user1";
		f_DTO.setUserName(userId);
		f_DTO.setFollow(name);
		System.out.println(f_DTO);
		
//		mapper ������.
		MyPeedMapper mapper = sqlSession.getMapper(MyPeedMapper.class);
		
		mapper.insertRequest(f_DTO);
		
		
		return "/peed/followRequest";
	}
	
	@RequestMapping("/requestDelete")
	public String requestDelete(HttpServletRequest request, Model model, @RequestParam("name") String name, FollowDTO f_DTO) {
		System.out.println("requestDelete ����");
		
		String userId ="user1";
		f_DTO.setUserName(userId);
		f_DTO.setFollow(name);
		
		MyPeedMapper mapper = sqlSession.getMapper(MyPeedMapper.class);
		mapper.requestDelete(f_DTO);
		
		return "peed/followRequest";
	}
	

}
