/*
 * �� ��Ʈ���� DAO �����ϴ� ���� �ƴ϶�,DB �۾� �̿��� ����Ͻ� ������ �����Ѵ�
 * �̶� ��Ʈ�ѷ��� ������ ����Ͻ� ��ü�� ���� �Ҵ��ϰ� �Ǹ�, ��Ʈ�ѷ� ������ 
 * ������ �������� ���ϰ� �ǰ� MVC�� ������ ���� �ʴ´�...
 * �ذ�å) ����ȭ�� �� ��Ʈ�� ��ü���� �����Ͽ� ������ ������ �� �ִ� �߰� ������
 * �� �ʿ��ϴ� �� ���縦 Service�� �Ѵ�!!
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











