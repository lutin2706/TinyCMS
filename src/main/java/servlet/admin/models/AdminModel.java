package servlet.admin.models;

public class AdminModel {

	private String blogTitle;
	private long nbrPosts;
	private long nbrCategories;
	private long nbrTags;
	private long nbrUsers;
	
	public AdminModel(String title, long nbrPosts, long nbrCategories, long nbrTags, long nbrUsers) {
		this.blogTitle = title;
		this.nbrPosts = nbrPosts;
		this.nbrCategories = nbrCategories;
		this.nbrTags = nbrTags;
		this.nbrUsers = nbrUsers;
	}

	public long getNbrPosts() {
		return nbrPosts;
	}

	public long getNbrCategories() {
		return nbrCategories;
	}

	public long getNbrTags() {
		return nbrTags;
	}

	public long getNbrUsers() {
		return nbrUsers;
	}

	public String getBlogTitle() {
		return blogTitle;
	}
	
}
