package repositories.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import config.EMF;
import entities.Category;
import repositories.CategoryRepository;

public class CategoryRepositoryImpl implements CategoryRepository {

	EntityManager em = EMF.getEM();
	
	@Override
	public long count() {
		Query query = em.createQuery("SELECT COUNT(c.id) FROM Category c");
		long nbr = (long)query.getSingleResult();
		return nbr;
	}

	@Override
	public List<Category> getList() {
		Query query = em.createQuery("SELECT c FROM Category c");
		List<Category> categories = query.getResultList();
		return categories;
	}

	@Override
	public Category get(Long catId) {
		em.getTransaction().begin();
		Category cat = em.find(Category.class, catId);
		em.getTransaction().commit();
		return cat;
	}

}
