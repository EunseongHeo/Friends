package com.friends.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// ���ƿ� ���� ���̺�
public class Likes {

	long post_no;	//post index
	long reply_no;	//comment index
	String username;	//���ƿ並 ���� ����
	
}
