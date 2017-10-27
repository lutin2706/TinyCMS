package repositories;

import java.util.List;

import entities.Category;

public interface CategoryRepository {

	long count();

	List<Category> getList();

	Category get(Long catId);

}
