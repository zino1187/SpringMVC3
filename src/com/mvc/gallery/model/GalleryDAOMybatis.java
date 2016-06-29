package com.mvc.gallery.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//�Ʒ��� ������̼��� ����ؾ� �������� DAO ������Ʈ�� ������!!
@Repository
public class GalleryDAOMybatis implements GalleryDAO{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public List selectAll() {
		return null;
	}
	public Gallery select(int gallery_id) {
		return null;
	}
	public int insert(Gallery gallery) {
		sqlSessionTemplate.insert("Gallery.insert",gallery);
		return gallery.getGallery_id();
	}
	public void update(Gallery gallery) {
	}
	public void delete(int gallery_id) {
	}
	
}
