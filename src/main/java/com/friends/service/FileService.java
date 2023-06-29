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

//	파일 업로드
	public void uploadFile(MultipartHttpServletRequest multiRequest) throws Exception{
		log.info("uploadFile() method of FileSErvice class."); 
		
//		파일이 업로드 될 로컬 저장 경로를 생성한다.
//		'사용자' 폴더 아래 'FriendsFileUpload'가 없으면 폴더 생성하는 코드
		File file = new File(System.getProperty("user.home").toString() + File.separator + "FriendsFileUpload");
		if(!file.exists()) file.mkdir();
//		아래의 경우 '사용자'폴더의 'FriendsFileUpload' 폴더에 업로드된다.
		String filePath = System.getProperty("user.home").toString() + File.separator + "FriendsFileUpload" ;
//		log.info("현재 경로: " + path);

		
//		업로드되는 파일 정보 수집
		
//		파라미터 이름을 키로 파라미터에 해당하는 파일 정보를 값으로 하는 Map을 가져온다.
		Map<String, MultipartFile> files = multiRequest.getFileMap();
		log.info("files: " + files);
		
//		files.entrySet()의 요소를 읽어온다.
		Iterator<Entry<String, MultipartFile>> iterator = files.entrySet().iterator(); 
		MultipartFile multipartFile;
		
		
//		파일명이 중복되었을 경우, 사용할 스트링 객체
		String saveFileName = "", saveNestedNameFilePath = "";
		
//		읽어올 요소가 있으면 true, 없으면 false를 반환한다.
		while(iterator.hasNext()) {
			
			Entry<String, MultipartFile> entry = iterator.next();
			
//			entry에 값을 가져온다.
			multipartFile = entry.getValue();
//			파일명
			String fileName = multipartFile.getOriginalFilename();
//			확장자를 제외한 파일명
			String fileCutName = fileName.substring(0, fileName.lastIndexOf("."));
//			확장자
			String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1);
//			저장될 경로와 파일명
			String saveFilePath = filePath + File.separator + fileName;
//			filePath에 해당되는 파일의 File 객체를 생성한다.
			
			File saveFile = new File(saveFilePath);
			
//			saveFile이 File이면 true, 아니면 false
//			파일명이 중복일 경우 파일명(1).확장자, 파일명(2).확장자 와 같은 형태로 생성한다.
			if(saveFile.isFile()) {
				boolean _exist = true;
				
				int index = 0;
				
//				동일한 파일명이 존재하지 않을 때까지 반복한다.
				while(_exist) {
					index++;
					saveFileName = fileCutName + "(" + index + ")." + fileExt;
					String dictFile = filePath + File.separator + saveFileName; 
					_exist = new File(dictFile).isFile();
					if(!_exist) {
						saveNestedNameFilePath = dictFile;
					}
					
				}
				
//				생성한 파일 객체를 업로드 처리하지 않으면 임시파일에 저장된 파일이 자동적으로 삭제되기 때문에 
//				transferTo(File f) 메서드를 이용하여 업로드 처리한다.
				multipartFile.transferTo(new File(saveNestedNameFilePath));
				
			}
			else {
//				생성한 파일 객체를 업로드 처리하지 않으면 임시파일에 저장된 파일이 자동적으로 삭제되기 때문에 
//				transferTo(File f) 메서드를 이용하여 업로드 처리한다.
				multipartFile.transferTo(saveFile);
			}
			
		}
		
	}
		
}
