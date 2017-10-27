package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Incrémenté de un par un
	private Long id;
	
	@Column(nullable=false, unique=true)
	private String login;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false, unique=true)
	private String email;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private Role role;
	
	@OneToMany(mappedBy="author", fetch=FetchType.LAZY) 
	private Set<Post> posts = new HashSet<>();
	
	@OneToMany(mappedBy="author", fetch=FetchType.LAZY)
	private Set<Comment> comments = new HashSet<>();
	
	public User() {
	}

	public User(String login, String password, String email, Role role) {
		this.login = login;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "User [" + (id != null ? "id=" + id + ", " : "") + (login != null ? "login=" + login + ", " : "")
				+ (password != null ? "password=" + password + ", " : "")
				+ (email != null ? "email=" + email + ", " : "") + (role != null ? "role=" + role + ", " : "")
				+ "]";
	}
	
}
