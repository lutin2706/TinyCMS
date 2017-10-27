package services.implementations;

import java.util.List;

import entities.Role;
import repositories.RoleRepository;
import repositories.implementations.RoleRepositoryImpl;
import services.RoleService;

public class RoleServiceImpl implements RoleService {

	RoleRepository rep = new RoleRepositoryImpl();
	
	@Override
	public List<Role> getList() {
		return rep.getList();
	}

	@Override
	public Role get(Long roleId) {
		return rep.get(roleId);
	}

}
