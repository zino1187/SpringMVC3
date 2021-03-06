/*
 * 모델 파트에는 DAO 존재하는 것이 아니라,DB 작업 이외의 비즈니스 업무도 존재한다
 * 이때 컨트롤러가 각각의 비즈니스 객체에 일을 할당하게 되면, 컨트롤러 본연의 
 * 업무에 열중하지 못하게 되고 MVC의 취지에 맞지 않는다...
 * 해결책) 세분화된 모델 파트의 객체들을 조합하여 업무를 수행할 수 있는 중간 관리자
 * 가 필요하다 이 존재를 Service라 한다!!
 * */
package com.mvc.gallery.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class GalleryService {
	@Autowired
	private GalleryDAO galleryDAO;
	
	@Autowired
	private FileManager fileManager;
		
	public List selectAll() {
		return null;
	}
	public Gallery select(int gallery_id) {
		return null;
	}
	public int insert(Gallery gallery){	
		return galleryDAO.insert(gallery);
	}
	public void upload(MultipartFile multi, String path, int key){
		fileManager.upload(multi, path, key);
	}
	public void update(Gallery gallery) {
	}
	public void delete(int gallery_id) {
	}
	
	
}











