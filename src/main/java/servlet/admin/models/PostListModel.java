package servlet.admin.models;

import java.util.List;

import entities.Post;

public class PostListModel {
	
	private String blogTitle;
	private List<Post> posts;

	public PostListModel(String blogTitle, List<Post> posts) {
		this.blogTitle = blogTitle;
		this.posts = posts;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public List<Post> getPosts() {
		return posts;
	}
	
	

}
