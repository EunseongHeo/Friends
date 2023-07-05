package com.friends.controller;

import java.io.File;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.friends.service.FileService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/post")
//	메인 페이지, homePeed에서의 CRUD 기능에 대한 컨트롤러
public class HomePeedController {
	
	@Resource(name = "fileService")
	FileService fileService;
	
//	createPost 페이지로 분기
//	test for 이미지 파일 확인
	@RequestMapping(value = "/create")
	public void postCreate(MultipartFile[] uploadFiles) {
		log.info("postCreate() Method of HomePeedController class");
		log.info("uploadFiles: " + uploadFiles);
//		for(MultipartFile multipartFile : uploadFiles) {
//			log.info("Upload File Name: " + multipartFile.getOriginalFilename());
//			log.info("Upload File Size: " + multipartFile.getSize());
//			
//		}
		
		
////		fileService 처리.
//		try {
////			fileService.uploadFile(multiRequest);
//		} catch (Exception e) {
//			log.info("Exception m : {}", e.getMessage());
////			e.printStackTrace();
//		}
		
//		return "redirect:createPost";
		
	}
	
	
	
	
	
}
