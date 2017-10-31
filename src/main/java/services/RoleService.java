package services;

import java.util.List;

import entities.Role;

public interface RoleService {

	List<Role> getList();

	Role get(Long roleId);

}
