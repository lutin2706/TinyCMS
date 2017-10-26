package services.implementations;

import java.util.List;

import entities.Comment;
import repositories.CommentRepository;
import repositories.implementations.CommentRepositoryImpl;
import services.CommentService;

public class CommentServiceImpl implements CommentService {

	private CommentRepository rep = new CommentRepositoryImpl();
	
	@Override
	public Comment create(Comment c) {
		return rep.create(c);
	}

	@Override
	public Comment get(Long id) {
		return rep.get(id);
	}

	@Override
	public Comment update(Comment p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment remove(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
