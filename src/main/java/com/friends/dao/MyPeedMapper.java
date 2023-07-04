package com.friends.dao;

import java.util.ArrayList;

import com.friends.dto.FollowDTO;

// peed의 CRUD 기능과 관련된 인터페이스
// 단순히 peedMapper.xml에 기재된 sql을 호출하기 위한 인터페이스 => Mapper
public interface MyPeedMapper {

	ArrayList<FollowDTO> selectByFollow(String userId);
	ArrayList<FollowDTO> selectByFollowList(String userId);
	void insertRequest(FollowDTO f_DTO);
	void requestDelete(FollowDTO f_DTO);





}
