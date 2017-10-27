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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false, columnDefinition="text")
	private String body;
	
	@Column(nullable=false)
	private LocalDate date;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private User author;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy="post", fetch=FetchType.EAGER)
	private Set<Comment> comments = new HashSet<>();
	
	@ManyToMany(mappedBy="posts", fetch=FetchType.EAGER)
	private Set<Tag> tags = new HashSet<>();
	
	public Post() {
	}

	public Post(String title, String body, LocalDate date, User user, Category category) {
		this.title = title;
		this.body = body;
		this.date = date;
		this.author = user;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Post [" + (id != null ? "id=" + id + ", " : "") + (title != null ? "title=" + title + ", " : "")
				+ (body != null ? "body=" + body + ", " : "") + (date != null ? "date=" + date + ", " : "")
				+ (author != null ? "author=" + author + ", " : "")
				+ (category != null ? "category=" + category + ", " : "")
				+ "]";
	}

}
