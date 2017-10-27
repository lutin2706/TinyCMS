package servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Category;
import services.CategoryService;
import services.implementations.CategoryServiceImpl;
import servlet.admin.models.PostCatModel;

@WebServlet("/admin/createCategory")
public class CategoryServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    // TODO: limit this feature to admin
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		String blogTitle = "Blog de couture";
		System.out.println("\tAffichage du formulaire pour créer une nouvelle catégorie");
		
		CategoryService cs = new CategoryServiceImpl();
		
		PostCatModel model = new PostCatModel(blogTitle, cs.getList());
		request.setAttribute("model", model);
		
		request.getRequestDispatcher("/WEB-INF/admin/category.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		Long parentId = Long.valueOf(request.getParameter("parent"));

		CategoryService cs = new CategoryServiceImpl();
		Category parent = null;
		if (parentId != 0)
			parent = cs.get(parentId);
		
		Category category = new Category(name, parent);
		cs.create(category);
		
		response.sendRedirect("../admin/");
	}

}
