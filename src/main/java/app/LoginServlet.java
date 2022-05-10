package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		int error = 0;
		
		if (password == null || password.isEmpty()) {
			request.setAttribute("passError", "PASSは必須です");
			error = 1;
		}
		if (id == null || id.isEmpty()) {
			request.setAttribute("idError", "IDは必須です");
			error = 1;
		}
		
		if (error == 1) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		int login = 0;
		
		if (id.equals("axiz") && password.equals("axizuser")) {
			login = 1;

		}
		
		if (id.equals("technocore") && password.equals("techno-pass")) {
			login = 1;
		}
		
		if(login == 1) {
			request.setAttribute("id", id);
			request.getRequestDispatcher("result.jsp").forward(request, response);
		}else {
			request.setAttribute("loginError", "ID,またはPASSが違います。");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
