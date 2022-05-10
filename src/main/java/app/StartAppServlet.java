package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	// ここに必要な処理を実装してください。
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        
        String app = request.getParameter("app");
        String name = request.getParameter("name");
        
        String result = "";
        
        
		if(!(name.equals(""))) {
			
			if (app.equals("game")) {
				app.GameApp obj = new GameApp("何か");
				result = obj.start(name);

			} else {
				app.CardGameApp obj = new CardGameApp("トランプ");
				result = obj.start(name);


			}

		request.setAttribute("name", result);
		}
		request.getRequestDispatcher("/appStart.jsp").forward(request,  response);
		
//        switch (app) {
//        case "game":
//        	GameApp obj = new GameApp();
//        	break;
//        case "cards":
//        	CardGameApp obj = new CardGameApp();
//        	break;
        }
        	
}












