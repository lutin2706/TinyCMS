package admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import entities.User;
import services.UserService;
import services.implementations.UserServiceImpl;

@WebServlet("/user/create")
public class CreateUser extends HttpServlet {
	
	private UserService userService = new UserServiceImpl();
	
	public void doPost(HttpServlet req, HttpServletResponse resp)
		throws ServletException, IOException
		{
			
			User u = null;
			// Do smth
			userService.create(u);
		}
}
