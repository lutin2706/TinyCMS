package repositories;

import java.util.List;

import entities.Post;

public interface PostRepository {

	List<Post> getList();
	Post get(Long id);
}
