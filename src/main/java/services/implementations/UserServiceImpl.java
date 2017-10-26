package services.implementations;

import entities.User;
import repositories.UserRepository;
import repositories.implementations.UserRepositoryImpl;
import services.UserService;

public class UserServiceImpl implements UserService{

	private UserRepository rep = new UserRepositoryImpl();
	
	public User create(User u) {
		return rep.create(u);
	}

	@Override
	public User get(Long id) {
		return rep.get(id);
	}

	@Override
	public User getByLogin(String login, String password) {
		return rep.getByLogin(login, password);
	}

	@Override
	public long count() {
		return rep.count();
	}
	

}
