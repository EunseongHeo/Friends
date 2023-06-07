package com.friends.dto;

import java.util.Date;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
//myInfo ���� �Խñ� ǥ�ý� �ʿ��� ������ view page�� ������ �� �ʿ��� ��ü�� ������ Ŭ����
public class UserInfoDTO {
	
	String username;	//���� id
	String id;			//�α��� id
	String name;		//�̸�
	String profile;		//������ ���ϸ�
	Date birth;		//����
	String phone;	//�޴��� ��ȣ 	//?����) '-' ����? ������?
	String email;	//�̸���		//?����) '@' ����? ������?
	char sex;		// '1' : ����, '2' : ����
	String intro;	//�ڱ�Ұ��� 500byte ����
	Date joinDate;	//���� ������

}
