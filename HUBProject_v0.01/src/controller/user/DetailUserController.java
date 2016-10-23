package controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.logic.UserServiceLogic;
import service.pacade.UserService;

@WebServlet("/userDetail.do")
public class DetailUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		service = new UserServiceLogic();
		
		String userId = request.getParameter("userId");
		int listOpt = Integer.parseInt(request.getParameter("listOpt"));
		String connChain = request.getParameter("connChain");
		
		User user = service.findUserByUserId(userId);
		
		request.setAttribute("user", user);
		request.setAttribute("listOpt", listOpt);
		request.setAttribute("connChain", connChain);
		request.getRequestDispatcher("User/detailUser.jsp").forward(request, response);
	}

}
