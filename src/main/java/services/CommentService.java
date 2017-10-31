package services;

import java.util.List;

import entities.Comment;

public interface CommentService {

	Comment create(Comment p);
	Comment get(Long id);
	Comment update(Comment p);
	Comment remove(Long id);
	List<Comment> getList();
	long count();
}
