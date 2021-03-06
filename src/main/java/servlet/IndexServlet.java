package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.PostService;
import services.implementations.PostServiceImpl;
import servlet.models.IndexModel;

@WebServlet({"","/index"})
public class IndexServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		// TODO : get Blog title from DB
		String blogTitle = "Blog de couture";
		System.out.println("\tAffichage de la liste des posts");
		
		PostService ps = new PostServiceImpl();
		
		IndexModel model = new IndexModel(blogTitle, ps.getList());
		request.setAttribute("model", model);
		
		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
	}

}
