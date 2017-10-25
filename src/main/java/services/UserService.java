package services;

import entities.User;

public interface UserService {
	// CRUD
	User create(User u);
	User get(Long id);
	User getByLogin(String login, String password);
}
