package servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Comment;
import entities.Post;
import entities.User;
import services.CommentService;
import services.PostService;
import services.UserService;
import services.implementations.CommentServiceImpl;
import services.implementations.PostServiceImpl;
import services.implementations.UserServiceImpl;

@WebServlet("/comment")
public class CommentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		
		String text = request.getParameter("text");
		PostService ps = new PostServiceImpl();
		Post post = ps.get(Long.valueOf(request.getParameter("postid")));
		
		UserService us = new UserServiceImpl();
		User author = us.get(Long.valueOf(request.getParameter("author")));
		Comment comment = new Comment(text, LocalDate.now(), post, author, null);
		
		CommentService cs = new CommentServiceImpl();
		cs.create(comment);
		
		// TODO page post pas rafraîchie lorsqu'on poste le commentaire
		response.sendRedirect("post?id=" + post.getId());
		
//		User user = us.getByLogin(request.getParameter("login"), request.getParameter("password"));
//
//		System.out.println("\tUser retrieved : " + user);
//
//		if (user != null) {// && BCrypt.checkpw(request.getParameter("password"), user.getPassword())) {
//			System.out.println("\tUtilisateur retrouvé et password correct => accès à la page d'accueil");
//			request.getSession().setAttribute("user", user);
//			response.sendRedirect("index");
//		} else {
//			System.out.println("\tUtilisateur inconnu ou password incorrect => retour à la page de login");
//			request.setAttribute("erreur", "Mauvais login/password. Veuillez ré-essayer");
//			request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
//		}
	}
}
