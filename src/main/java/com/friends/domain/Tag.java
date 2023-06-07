package com.friends.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// �±� �� �ʿ��� ��ü�� ������ Ŭ����
public class Tag {
	
	long post_no;	//�±� ��ġ_ �Խñ��� ���
	long reply_no;	//�±� ��ġ_ ����� ���
	String username;	//tagging user (�±׸� �� ���)
	String taged;	//tagged user(�±׸� ���� ���)	

}
