package repositories.implementations;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import config.EMF;
import entities.User;
import repositories.UserRepository;

public class UserRepositoryImpl implements UserRepository {
	
	private EntityManager em = EMF.getEM();

	public User create(User u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		return u;
	}
	
	public User getUser(String log, String pwd) {
		Query query = em.createQuery("SELECT u FROM User u WHERE u.login LIKE :login AND u.password LIKE :password");
		query.setParameter("login", log);
		query.setParameter("password", pwd);
		User user = (User)query.getSingleResult();
		return user;
	}

	@Override
	public User getByLogin(String log, String pwd) {
		Query query = em.createQuery("SELECT u FROM User u WHERE u.login LIKE :login AND u.password LIKE :password");
		query.setParameter("login", log);
		query.setParameter("password", pwd);
		User user = null;
		try {
			user = (User)query.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("Aucun user trouvé avec ce password");
		}
		return user;
	}

}
