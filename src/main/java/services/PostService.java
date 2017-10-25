package services;

import java.util.List;

import entities.Post;

public interface PostService {

	Post create(Post p);
	Post get(Long id);
	Post update(Post p);
	Post remove(Long id);
	List<Post> getList();
}
