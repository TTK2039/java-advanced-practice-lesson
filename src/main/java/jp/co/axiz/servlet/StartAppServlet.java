package jp.co.axiz.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;
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
        
        App a = null;
                
        if(!(name.equals(""))) {
        	if(app.equals("other")) {
        		result = "起動に失敗しました。";
        	}else {
        		switch (app) {
        		case ("cards"):
        			a = new CardGameApp("トランプ");
        		
        			break;
        		case ("darts"):
        			a = new DartsGameApp("ダーツ");
        			break;
        		case ("clock"):
        			a = new ClockApp();
        			break;
        		}
        	result = a.start(name);
        	}
        }
        
        if (a instanceof GameApp) {
        	request.setAttribute("time", "実行時間：" + ((GameApp) a).getTime() + "分");
        	
        }

			
			
			
//			if (app.equals("darts")) {
//				app.DartsGameApp obj = new app.DartsGameApp("ダーツ");
//				result = obj.start(name) + obj.play();
//
//			} else if(app.equals("cards")){
//				app.CardGameApp obj = new app.CardGameApp("トランプ");
//				result = obj.start(name) + obj.play();
//			} else if (app.equals("clock")) {
//				app.ClockApp obj = new app.ClockApp();
//				result = obj.start(name);
//			}

		request.setAttribute("name", result);
		
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












