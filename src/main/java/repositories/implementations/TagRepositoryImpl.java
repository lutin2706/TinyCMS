package repositories.implementations;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import config.EMF;
import repositories.TagRepository;

public class TagRepositoryImpl implements TagRepository {

	EntityManager em = EMF.getEM();
	
	@Override
	public long count() {
		Query query = em.createQuery("SELECT COUNT(t.id) FROM Tag t");
		long nbr = (long)query.getSingleResult();
		return nbr;
	}

}
