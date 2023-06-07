package com.friends.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// 게시글 작성시 첨부되는 파일의 파일명을 객체로 가지는 클래스
public class Files {
	
	long file_no;		//파일 인덱스
	long post_no;		//게시글 인덱스
	String fileame;		//file명
	String rFilename;	//real file명

}