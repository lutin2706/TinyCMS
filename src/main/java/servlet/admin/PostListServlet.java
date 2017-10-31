package servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.PostService;
import services.implementations.PostServiceImpl;

@WebServlet("/admin/listPosts")
public class PostListServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private PostService ps = new PostServiceImpl();
	
      // TODO: Limit this feature to connected users
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		String blogTitle = "Blog de couture";
		System.out.println("\tAffichage de la liste des articles");
			
		PostListModel model = new PostListModel(blogTitle, ps.getList());
		request.setAttribute("model", model);
		
		request.getRequestDispatcher("/WEB-INF/admin/postlist.jsp").forward(request, response);
	}

}
