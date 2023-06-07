package com.friends.dto;

import java.util.Date;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// home peed 에서 게시글 표시시 필요한 정보를 view page로 가져갈 때 필요한 객체를 가지는 클래스
public class PostDTO {
	
	long post_no;	//게시물 번호 (인덱스)
	String username;	//게시물 작성자
	String text;	//게시물 내 텍스트
	Date writeDate;	//게시글 작성 일자
	long likeHit;	//게시글 좋아요 개수
	
}
