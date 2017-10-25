package servlet.models;

import entities.Post;

public class PostModel {

	private String blogTitle;
	
	private Post post;

	public PostModel(String blogTitle, Post post) {
		this.blogTitle = blogTitle;
		this.post = post;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public Post getPost() {
		return post;
	}
	
	
}
