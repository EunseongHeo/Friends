package com.friends.service;

import java.util.List;

//post 기능의 대표적인 기능인 crud 가이드 라인
public interface CRUDService {
	
	public void create(Object obj);
	public List<Object> read();
	public void update();
	public void delete();

}
