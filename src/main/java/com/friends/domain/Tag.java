package com.friends.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// 태그 시 필요한 객체를 가지는 클래스
public class Tag {
	
	long post_no;	//태그 위치_ 게시글인 경우
	long reply_no;	//태그 위치_ 댓글인 경우
	String username;	//tagging user (태그를 한 사람)
	String taged;	//tagged user(태그를 당한 사람)	

}
