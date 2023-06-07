package com.friends.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// 게시글 조회시 한 게시글에 첨부된 파일명 리스트를 객체로 가지는 클래스.
public class FilesDTO {
	
	long post_no;		//게시글 인덱스
	List<String> fileNameList;	//file name 리스트
	List<String> rFileNameList; //real file name 리스트

}
