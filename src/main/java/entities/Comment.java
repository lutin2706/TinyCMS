package entities;

import java.time.LocalDate;
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
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String text;
	
	@Column(nullable=false)
	private LocalDate date;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private Post post;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private User author;
	
	@JoinColumn(nullable=true)
	@ManyToOne
	private Comment parent;
	
	@OneToMany(mappedBy="parent", fetch=FetchType.LAZY)
	private Set<Comment> children = new HashSet<>();
	
	public Comment() {
	}

	protected Comment(String text, LocalDate date, Post post, User author, Comment parent) {
		this.text = text;
		this.date = date;
		this.post = post;
		this.author = author;
		this.parent = parent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Comment getParent() {
		return parent;
	}

	public void setParent(Comment parent) {
		this.parent = parent;
	}

	public Set<Comment> getChildren() {
		return children;
	}

	public void setChildren(Set<Comment> children) {
		this.children = children;
	}
}
