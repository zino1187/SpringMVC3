package com.mvc.gallery.model;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileManager {
	//클라이언트가 전송한 파일을 서버의 저장하는 역할을 수행하는 메서드
	public void upload(MultipartFile multi, String saveDir){
		System.out.println(saveDir);
		
		try {
			multi.transferTo(new File(saveDir+File.separator+multi.getOriginalFilename()));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
