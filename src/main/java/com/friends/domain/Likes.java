package com.friends.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// 좋아요 관리 테이블
public class Likes {

	long post_no;	//post index
	long reply_no;	//comment index
	String username;	//좋아요를 누른 유저
	
}
