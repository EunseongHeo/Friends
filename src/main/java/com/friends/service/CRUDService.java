
package com.friends.service;

import java.util.List;

//post ����� ��ǥ���� ����� crud ���̵� ����
public interface CRUDService {
	
	public void create(Object obj);
	public List<Object> read();
	public void update();
	public void delete();

}
