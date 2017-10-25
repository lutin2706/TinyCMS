package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Post;
import services.PostService;
import services.implementations.PostServiceImpl;
import servlet.models.PostModel;

@WebServlet("/post")
public class PostServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		// TODO : get Blog title from DB
		String blogTitle = "Blog de couture";
		System.out.println("\tAffichage d'un post");
		
		PostService ps = new PostServiceImpl();
		Post post = ps.get(Long.parseLong(request.getParameter("id")));
		
		
		PostModel model = new PostModel(blogTitle, post);
		request.setAttribute("model", model);
		
		request.getRequestDispatcher("WEB-INF/post.jsp").forward(request, response);
	}

}
