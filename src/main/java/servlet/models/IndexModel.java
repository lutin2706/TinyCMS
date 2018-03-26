package servlet.models;

import java.util.ArrayList;
import java.util.List;

import entities.Category;
import entities.Post;

public class IndexModel {
	
	private String blogTitle;
	private List<Post> posts = new ArrayList<>();
	private List<Category> categories = new ArrayList<>();

	public IndexModel(String blogTitle, List<Post> posts, List<Category> cats) {
		this.blogTitle = blogTitle;
		this.posts = posts;
		this.categories = cats;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public List<Category> getCategories() {
		return categories;
	}
}
