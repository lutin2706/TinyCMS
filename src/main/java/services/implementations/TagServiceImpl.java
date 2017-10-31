package services.implementations;

import repositories.TagRepository;
import repositories.implementations.TagRepositoryImpl;
import services.TagService;

public class TagServiceImpl implements TagService {
	
	TagRepository rep = new TagRepositoryImpl();

	@Override
	public long count() {
		return rep.count();
	}

}
