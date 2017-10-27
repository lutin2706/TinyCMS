package servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Role;
import entities.User;
import services.RoleService;
import services.UserService;
import services.implementations.RoleServiceImpl;
import services.implementations.UserServiceImpl;
import servlet.admin.models.UserModel;

@WebServlet("/admin/createUser")
public class UserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private RoleService rs = new RoleServiceImpl();
       
	// TODO: Limit this feature to admin
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		String blogTitle = "Blog de couture";
		System.out.println("\tAffichage du formulaire pour créer un nouvel utilisateur");
		
		UserModel model = new UserModel(blogTitle, rs.getList());
		request.setAttribute("model", model);
		
		request.getRequestDispatcher("/WEB-INF/admin/user.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		
		request.setCharacterEncoding("UTF-8");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		Long roleId = Long.valueOf(request.getParameter("role"));

		UserService us = new UserServiceImpl();
		
		Role role = rs.get(roleId);
		User user = new User(login, password, email, role);
		us.create(user);
		
		response.sendRedirect("../admin/");
	}

}
