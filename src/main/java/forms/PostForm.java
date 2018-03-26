package forms;

import javax.validation.constraints.Size;

public class PostForm {

	@Size(min=3, max=30)
	private String title;
	
	@Size(min=100, max = 500)
	private String body;

	public PostForm() {
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
}
