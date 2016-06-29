/*
 * �� ��Ʈ���� DAO �����ϴ� ���� �ƴ϶�,DB �۾� �̿��� ����Ͻ� ������ �����Ѵ�
 * �̶� ��Ʈ�ѷ��� ������ ����Ͻ� ��ü�� ���� �Ҵ��ϰ� �Ǹ�, ��Ʈ�ѷ� ������ 
 * ������ �������� ���ϰ� �ǰ� MVC�� ������ ���� �ʴ´�...
 * �ذ�å) ����ȭ�� �� ��Ʈ�� ��ü���� �����Ͽ� ������ ������ �� �ִ� �߰� ������
 * �� �ʿ��ϴ� �� ���縦 Service�� �Ѵ�!!
 * */
package com.mvc.gallery.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class GalleryService {
	private GalleryDAO galleryDAO;
	private FileManager fileManager;
	
	public void setGalleryDAO(GalleryDAO galleryDAO) {
		this.galleryDAO = galleryDAO;
	}
	public void setFileManager(FileManager fileManager) {
		this.fileManager = fileManager;
	}
	
	public List selectAll() {
		return null;
	}
	public Gallery select(int gallery_id) {
		return null;
	}
	public void insert(Gallery gallery){	
		galleryDAO.insert(gallery);
	}
	public void upload(MultipartFile multi, String path){
		fileManager.upload(multi, path);
	}
	public void update(Gallery gallery) {
	}
	public void delete(int gallery_id) {
	}
	
	
}











