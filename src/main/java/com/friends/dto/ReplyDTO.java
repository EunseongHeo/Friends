package com.friends.dto;

import java.util.Date;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
//home peed ���� ��� ǥ�ý� �ʿ��� ������ view page�� ������ �� �ʿ��� ��ü�� ������ Ŭ����
public class ReplyDTO {
	
	long reply_no;	//��� ��ȣ (�ε���)
	String username;	//��� �ۼ���
	long post_no;	//����� �Խñ� ��ȣ(�ε���)
	int gup;		
	int lev;		//������� ��������
	int seq;		//���� ��ȣ
	String re_text;	//��� ����		//colume ���� �׳� text�� �ص� ���� ������?
	Date writeDate;	//��� �ۼ� ����
	long likeHit;	//��� ���ƿ� ��

}
