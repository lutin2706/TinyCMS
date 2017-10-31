package repositories;

import entities.Comment;

public interface CommentRepository {
	
	Comment get(Long id);

	Comment create(Comment c);

	long count();

}
