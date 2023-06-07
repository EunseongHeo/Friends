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
// �Խñ� ��ȸ�� �� �Խñۿ� ÷�ε� ���ϸ� ����Ʈ�� ��ü�� ������ Ŭ����.
public class FilesDTO {
	
	long post_no;		//�Խñ� �ε���
	List<String> fileNameList;	//file name ����Ʈ
	List<String> rFileNameList; //real file name ����Ʈ

}
