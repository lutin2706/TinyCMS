package services.implementations;

import java.util.List;

import entities.Category;
import repositories.CategoryRepository;
import repositories.implementations.CategoryRepositoryImpl;
import services.CategoryService;

public class CategoryServiceImpl implements CategoryService {

	CategoryRepository rep = new CategoryRepositoryImpl();
	
	@Override
	public long count() {
		return rep.count();
	}

	@Override
	public List<Category> getList() {
		return rep.getList();
	}

	@Override
	public Category get(Long catId) {
		return rep.get(catId);
	}

}
