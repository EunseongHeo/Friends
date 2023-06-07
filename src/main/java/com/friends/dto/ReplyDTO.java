package com.friends.dto;

import java.util.Date;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
//home peed 에서 댓글 표시시 필요한 정보를 view page로 가져갈 때 필요한 객체를 가지는 클래스
public class ReplyDTO {
	
	long reply_no;	//댓글 번호 (인덱스)
	String username;	//댓글 작성자
	long post_no;	//댓글의 게시글 번호(인덱스)
	int gup;		
	int lev;		//댓글인지 대댓글인지
	int seq;		//대댓글 번호
	String re_text;	//댓글 내용		//colume 명을 그냥 text로 해도 되지 않을까?
	Date writeDate;	//댓글 작성 일자
	long likeHit;	//댓글 좋아요 수

}
