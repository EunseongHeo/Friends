package com.friends.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// �Խñ� �ۼ��� ÷�εǴ� ������ ���ϸ��� ��ü�� ������ Ŭ����
public class Files {
	
	long file_no;		//���� �ε���
	long post_no;		//�Խñ� �ε���
	String fileame;		//file��
	String rFilename;	//real file��

}