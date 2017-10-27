package services;

import java.util.List;

import entities.Category;

public interface CategoryService {

	long count();
	List<Category> getList();
	Category get(Long catId);

}
