package servlet.admin.models;

import java.util.List;

import entities.Category;

public class PostCatModel {
	
	private String blogTitle;
	private List<Category> categories;

	public PostCatModel(String blogTitle, List<Category> categoryList) {
		this.blogTitle = blogTitle;
		this.categories = categoryList;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public List<Category> getCategories() {
		return categories;
	}

	
}
