package com.friends.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// 해쉬태그 데이터 입력시 필요한 객체로 구성된 클래스
public class Hashtag {
	
	String keyword;	//해쉬태그 키워드
	long post_no;	//게시글 인덱스
	long reply_no;	//댓글 인덱스
	
	
	
}
