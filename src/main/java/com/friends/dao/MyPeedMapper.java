package com.friends.dao;

import java.util.ArrayList;

import com.friends.dto.FollowDTO;

// peed�� CRUD ��ɰ� ���õ� �������̽�
// �ܼ��� peedMapper.xml�� ����� sql�� ȣ���ϱ� ���� �������̽� => Mapper
public interface MyPeedMapper {

	ArrayList<FollowDTO> selectByFollow(String userId);
	ArrayList<FollowDTO> selectByFollowList(String userId);





}
