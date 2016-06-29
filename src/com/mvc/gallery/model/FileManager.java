package com.mvc.gallery.model;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileManager {
	//Ŭ���̾�Ʈ�� ������ ������ ������ �����ϴ� ������ �����ϴ� �޼���
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
