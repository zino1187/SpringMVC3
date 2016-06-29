package com.mvc.gallery.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class GalleryDAOMybatis implements GalleryDAO{
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List selectAll() {
		return null;
	}
	public Gallery select(int gallery_id) {
		return null;
	}
	public void insert(Gallery gallery) {
		sqlSessionTemplate.insert("Gallery.insert",gallery);
	}
	public void update(Gallery gallery) {
	}
	public void delete(int gallery_id) {
	}
	
}
