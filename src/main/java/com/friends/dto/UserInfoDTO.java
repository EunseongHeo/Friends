package com.friends.dto;

import java.util.Date;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
//myInfo 에서 게시글 표시시 필요한 정보를 view page로 가져갈 때 필요한 객체를 가지는 클래스
public class UserInfoDTO {
	
	String username;	//계정 id
	String id;			//로그인 id
	String name;		//이름
	String profile;		//프로필 파일명
	Date birth;		//생일
	String phone;	//휴대폰 번호 	//?질문) '-' 포함? 비포함?
	String email;	//이메일		//?질문) '@' 포함? 비포함?
	char sex;		// '1' : 여자, '2' : 남자
	String intro;	//자기소개글 500byte 제한
	Date joinDate;	//계정 생성일

}
