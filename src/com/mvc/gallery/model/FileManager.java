package com.mvc.gallery.model;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	//클라이언트가 전송한 파일을 서버의 저장하는 역할을 수행하는 메서드
	public void upload(MultipartFile multi, String saveDir, int key){
		System.out.println(saveDir);
		
		try {
			File file=null;
			multi.transferTo(file=new File(saveDir+File.separator+multi.getOriginalFilename()));
			
			//파일의 이름을 교체하자!!
			String filename=multi.getOriginalFilename();
			
			String ext=filename.substring(filename.lastIndexOf(".")+1, filename.length());
			
			file.renameTo(new File(saveDir+"/"+key+"."+ext));	
		
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
