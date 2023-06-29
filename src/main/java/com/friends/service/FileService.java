package com.friends.service;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("fileService")
public class FileService {

//	���� ���ε�
	public void uploadFile(MultipartHttpServletRequest multiRequest) throws Exception{
		log.info("uploadFile() method of FileSErvice class."); 
		
//		������ ���ε� �� ���� ���� ��θ� �����Ѵ�.
//		'�����' ���� �Ʒ� 'FriendsFileUpload'�� ������ ���� �����ϴ� �ڵ�
		File file = new File(System.getProperty("user.home").toString() + File.separator + "FriendsFileUpload");
		if(!file.exists()) file.mkdir();
//		�Ʒ��� ��� '�����'������ 'FriendsFileUpload' ������ ���ε�ȴ�.
		String filePath = System.getProperty("user.home").toString() + File.separator + "FriendsFileUpload" ;
//		log.info("���� ���: " + path);

		
//		���ε�Ǵ� ���� ���� ����
		
//		�Ķ���� �̸��� Ű�� �Ķ���Ϳ� �ش��ϴ� ���� ������ ������ �ϴ� Map�� �����´�.
		Map<String, MultipartFile> files = multiRequest.getFileMap();
		log.info("files: " + files);
		
//		files.entrySet()�� ��Ҹ� �о�´�.
		Iterator<Entry<String, MultipartFile>> iterator = files.entrySet().iterator(); 
		MultipartFile multipartFile;
		
		
//		���ϸ��� �ߺ��Ǿ��� ���, ����� ��Ʈ�� ��ü
		String saveFileName = "", saveNestedNameFilePath = "";
		
//		�о�� ��Ұ� ������ true, ������ false�� ��ȯ�Ѵ�.
		while(iterator.hasNext()) {
			
			Entry<String, MultipartFile> entry = iterator.next();
			
//			entry�� ���� �����´�.
			multipartFile = entry.getValue();
//			���ϸ�
			String fileName = multipartFile.getOriginalFilename();
//			Ȯ���ڸ� ������ ���ϸ�
			String fileCutName = fileName.substring(0, fileName.lastIndexOf("."));
//			Ȯ����
			String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1);
//			����� ��ο� ���ϸ�
			String saveFilePath = filePath + File.separator + fileName;
//			filePath�� �ش�Ǵ� ������ File ��ü�� �����Ѵ�.
			
			File saveFile = new File(saveFilePath);
			
//			saveFile�� File�̸� true, �ƴϸ� false
//			���ϸ��� �ߺ��� ��� ���ϸ�(1).Ȯ����, ���ϸ�(2).Ȯ���� �� ���� ���·� �����Ѵ�.
			if(saveFile.isFile()) {
				boolean _exist = true;
				
				int index = 0;
				
//				������ ���ϸ��� �������� ���� ������ �ݺ��Ѵ�.
				while(_exist) {
					index++;
					saveFileName = fileCutName + "(" + index + ")." + fileExt;
					String dictFile = filePath + File.separator + saveFileName; 
					_exist = new File(dictFile).isFile();
					if(!_exist) {
						saveNestedNameFilePath = dictFile;
					}
					
				}
				
//				������ ���� ��ü�� ���ε� ó������ ������ �ӽ����Ͽ� ����� ������ �ڵ������� �����Ǳ� ������ 
//				transferTo(File f) �޼��带 �̿��Ͽ� ���ε� ó���Ѵ�.
				multipartFile.transferTo(new File(saveNestedNameFilePath));
				
			}
			else {
//				������ ���� ��ü�� ���ε� ó������ ������ �ӽ����Ͽ� ����� ������ �ڵ������� �����Ǳ� ������ 
//				transferTo(File f) �޼��带 �̿��Ͽ� ���ε� ó���Ѵ�.
				multipartFile.transferTo(saveFile);
			}
			
		}
		
	}
		
}
