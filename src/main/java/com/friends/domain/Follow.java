package com.friends.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
// 팔로우 시 필요한 객체로 구성된 클래스
public class Follow {
	
	String username;
	String follow;

}
