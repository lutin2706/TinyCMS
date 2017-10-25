package services.implementations;

import entities.User;
import repositories.UserRepository;
import repositories.implementations.UserRepositoryImpl;
import services.UserService;

public class UserServiceImpl implements UserService{

	private UserRepository rep = new UserRepositoryImpl();
	
	public User create(User u) {
		// TODO Auto-generated method stub
		return rep.create(u);
	}

}
