package com.mvc.gallery.model;

import java.util.List;

public interface GalleryDAO {
	public List selectAll();
	public Gallery select(int gallery_id);
	public void insert(Gallery gallery);
	public void update(Gallery gallery);
	public void delete(int gallery_id);
	
}
