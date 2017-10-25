package repositories.implementations;

import javax.persistence.EntityManager;

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

}
