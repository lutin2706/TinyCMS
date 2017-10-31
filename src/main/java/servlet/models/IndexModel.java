package servlet.models;

import java.util.ArrayList;
import java.util.List;

import entities.Post;

public class IndexModel {
	
	private String blogTitle;
	private List<Post> posts = new ArrayList<>();

	public IndexModel(String blogTitle, List<Post> list) {
		this.blogTitle = blogTitle;
		this.posts = list;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public List<Post> getPosts() {
		return posts;
	}

	
}
