package repositories.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import config.EMF;
import entities.Role;
import repositories.RoleRepository;

public class RoleRepositoryImpl implements RoleRepository {

	EntityManager em = EMF.getEM();
	
	@Override
	public List<Role> getList() {
		Query query = em.createQuery("SELECT r FROM Role r");
		List<Role> roles = query.getResultList();
		return roles;
	}

	@Override
	public Role get(Long roleId) {
		em.getTransaction().begin();
		Role role = em.find(Role.class, roleId);
		em.getTransaction().commit();
		return role;
	}

}
