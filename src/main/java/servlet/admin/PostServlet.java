package servlet.admin;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Post;
import entities.User;
import services.CategoryService;
import services.PostService;
import services.implementations.CategoryServiceImpl;
import services.implementations.PostServiceImpl;
import servlet.admin.models.PostCatModel;

@WebServlet("/admin/createPost")
public class PostServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
      // TODO: Limit this feature to writer and admin
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		String blogTitle = "Blog de couture";
		System.out.println("\tAffichage du formulaire pour créer un nouvel article");
		
		CategoryService cs = new CategoryServiceImpl();
		
		PostCatModel model = new PostCatModel(blogTitle, cs.getList());
		request.setAttribute("model", model);
		
		request.getRequestDispatcher("/WEB-INF/admin/post.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String body = request.getParameter("body");
		Long catId = Long.valueOf(request.getParameter("cat"));
		User author = (User)request.getSession().getAttribute("user");
		
		System.out.println("Title: " + title);
		if (author == null) {
			response.sendRedirect("../login");
			return;
		}

		CategoryService cs = new CategoryServiceImpl();
		Post post = new Post(title, body, LocalDate.now(), author, cs.get(catId));

		PostService ps = new PostServiceImpl();
		ps.create(post);
		
		response.sendRedirect("../admin/");
	}

}
