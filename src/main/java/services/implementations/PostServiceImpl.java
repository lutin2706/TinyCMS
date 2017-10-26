package services.implementations;

import java.util.List;

import entities.Post;
import repositories.PostRepository;
import repositories.implementations.PostRepositoryImpl;
import services.PostService;

public class PostServiceImpl implements PostService {

	private PostRepository rep = new PostRepositoryImpl();

	@Override
	public Post create(Post p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post get(Long id) {
		return rep.get(id);
	}

	@Override
	public Post update(Post p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post remove(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getList() {
		return rep.getList();
	}

	@Override
	public long count() {
		return rep.count();
	}

}
