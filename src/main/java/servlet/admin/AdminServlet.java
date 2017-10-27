package servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.CategoryService;
import services.PostService;
import services.TagService;
import services.UserService;
import services.implementations.CategoryServiceImpl;
import services.implementations.PostServiceImpl;
import services.implementations.TagServiceImpl;
import services.implementations.UserServiceImpl;
import servlet.admin.models.AdminModel;

@WebServlet("/admin/")
public class AdminServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		String blogTitle = "Blog de couture";
		System.out.println("\tAffichage de la page principale du panneau d'administration");
		
		UserService us = new UserServiceImpl();
		PostService ps = new PostServiceImpl();
		CategoryService cs = new CategoryServiceImpl();
		TagService ts = new TagServiceImpl();
		
		AdminModel model = new AdminModel(blogTitle, ps.count(), cs.count(), ts.count(), us.count());
		request.setAttribute("model", model);
		
		request.getRequestDispatcher("/WEB-INF/admin/admin.jsp").forward(request, response);
	}

}
