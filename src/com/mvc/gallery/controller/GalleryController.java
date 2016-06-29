/*
 * 겔러리 게시판 요청을 처리하는 동생 컨트롤러 3,4단계
 * */
package com.mvc.gallery.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.gallery.model.Gallery;
import com.mvc.gallery.model.GalleryService;

@Controller
@RequestMapping("/gallery")
public class GalleryController {
	
	@Autowired
	private GalleryService galleryService;
		
	@RequestMapping("/write.do")
	public String insert(Gallery gallery, HttpServletRequest request){
		
		ServletContext context=request.getServletContext();
		String saveDir=context.getRealPath("/data");
		
		//서비스에게 일시킬때 경로를 .. 같이 넘기자!! 
		int key=galleryService.insert(gallery);
		
		galleryService.upload(gallery.getMyFile() ,saveDir, key);
		
		return null;
	}
}










