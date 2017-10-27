package servlet.admin.models;

import java.util.List;

import entities.Role;

public class UserModel {
	
	private String blogTitle;
	private List<Role> roles;

	public UserModel(String blogTitle, List<Role> roles) {
		this.blogTitle = blogTitle;
		this.roles = roles;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public List<Role> getRoles() {
		return roles;
	}

}
