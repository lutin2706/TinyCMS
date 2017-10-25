package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.User;
import services.UserService;
import services.implementations.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		// TODO : get Blog title from DB
//		String blogTitle = "Blog de couture";
		System.out.println("\tAffichage de la page de login");
		
//		PostService ps = new PostServiceImpl();
//		
//		IndexModel model = new IndexModel(blogTitle, ps.getList());
//		request.setAttribute("blogTitle", model);
		
		request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		
		UserService us = new UserServiceImpl();
		User user = us.getByLogin(request.getParameter("login"), request.getParameter("password"));

		System.out.println("\tUser retrieved : " + user);

		if (user != null) {// && BCrypt.checkpw(request.getParameter("password"), user.getPassword())) {
			System.out.println("\tUtilisateur retrouvé et password correct => accès à la page d'accueil");
			request.getSession().setAttribute("user", user);
			response.sendRedirect("index");
		} else {
			System.out.println("\tUtilisateur inconnu ou password incorrect => retour à la page de login");
			request.setAttribute("erreur", "Mauvais login/password. Veuillez ré-essayer");
			request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
		}
	}
}
