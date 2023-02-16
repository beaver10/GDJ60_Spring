package com.iu.s1.util;

import java.io.File;
import java.nio.file.Path;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {

	//file을 HDD에 저장
	public String fileSave(MultipartFile multipartFile, String path) throws Exception{
		//1.어디에 저장할 것인가?
		//	/resources/upload/bankbook/...
		//2.저장관리는 운영체제가 담당
		
		File file = new File(path);
		
		//폴더가 존재하지 않으면 폴더 생성
		if(!file.exists()) {
			file.mkdirs();
		}
		
		//3.파일 저장
		//중복되지 않는 파일명 생성
		//Calendar ca = Calendar.getInstance();
		//ca.getTimeInMillis();
		String name = UUID.randomUUID().toString();
		
		//4.확장자 추가
		// Original name에서 subString을 이용해서 확장자를 추출 or
		// 이름 옆에 오리지널 네임을 붙이면 f79f0e5a-e0a5-4e1e-bdc9-9ef6a21a0dd1_357.jpg 처럼 확장자가 붙어 나옴
		name = name+"_"+multipartFile.getOriginalFilename();
		System.out.println(name);
		
		//5.파일 저장
		file = new File(file, name);
		
		//1) multiPartFile객체의 transferTo 메서드 사용
		//multipartFile.transferTo(file);
		
		//2) Spring API FileCopyUtis 객체의 copy 매서드 사용
		FileCopyUtils.copy(multipartFile.getBytes(), file);
		
		return name;
		
	}
	
}
