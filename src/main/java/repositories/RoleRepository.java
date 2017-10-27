package repositories;

import java.util.List;

import entities.Role;

public interface RoleRepository {

	List<Role> getList();

	Role get(Long roleId);

}
