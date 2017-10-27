package services;

import java.util.List;

import entities.Category;

public interface CategoryService {

	Category create(Category category);
	Category get(Long catId);
	List<Category> getList();
	long count();

}
