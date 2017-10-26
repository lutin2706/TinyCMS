package repositories;

import entities.User;

public interface UserRepository {
	User create(User u);

	User getByLogin(String login, String password);

	User get(Long id);
}
