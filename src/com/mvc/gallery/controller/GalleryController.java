/*
 * �ַ��� �Խ��� ��û�� ó���ϴ� ���� ��Ʈ�ѷ� 3,4�ܰ�
 * */
package com.mvc.gallery.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.gallery.model.Gallery;
import com.mvc.gallery.model.GalleryService;

@Controller
@RequestMapping("/gallery")
public class GalleryController {
	
	private GalleryService galleryService;
	
	public void setGalleryService(GalleryService galleryService) {
		this.galleryService = galleryService;
	}
		
	@RequestMapping("/write.do")
	public String insert(Gallery gallery, HttpServletRequest request){
		
		ServletContext context=request.getServletContext();
		String saveDir=context.getRealPath("/data");
		
		//���񽺿��� �Ͻ�ų�� ��θ� .. ���� �ѱ���!! 
		galleryService.insert(gallery);
		galleryService.upload(gallery.getMyFile() ,saveDir);
		
		return null;
	}
}










