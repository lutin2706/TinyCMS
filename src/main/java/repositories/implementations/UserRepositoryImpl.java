package repositories.implementations;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import config.EMF;
import entities.User;
import repositories.UserRepository;

public class UserRepositoryImpl implements UserRepository {

	public User create(User u) {
		// TODO Auto-generated method stub
		EntityManager em = EMF.getEM();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		return u;
	}
	
	public User getUser(String log, String pwd) {
		EntityManager em = EMF.getEM();
		Query query = em.createQuery("SELECT u FROM User u WHERE u.login LIKE :login AND u.password LIKE :password");
		query.setParameter("login", log);
		query.setParameter("password", pwd);
		User user = (User)query.getSingleResult();
		return user;
	}

}
