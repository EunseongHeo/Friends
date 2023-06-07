package com.friends.dto;

import java.util.Date;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// home peed ���� �Խñ� ǥ�ý� �ʿ��� ������ view page�� ������ �� �ʿ��� ��ü�� ������ Ŭ����
public class PostDTO {
	
	long post_no;	//�Խù� ��ȣ (�ε���)
	String username;	//�Խù� �ۼ���
	String text;	//�Խù� �� �ؽ�Ʈ
	Date writeDate;	//�Խñ� �ۼ� ����
	long likeHit;	//�Խñ� ���ƿ� ����
	
}
