package controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import service.logic.UserServiceLogic;
import service.pacade.UserService;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new UserServiceLogic();
		
		String userId = request.getParameter("userId");
		User user = new User();
		user.setUserId(userId);
		
		boolean result = service.login(user);
		
		if(result){
			boolean temp = service.checkAdmin(userId);
			
			if(temp == false){
				
				HttpSession session = request.getSession();
				session.setAttribute("userId", userId);
				
				response.sendRedirect("bucketlist.jsp");
			}else{
				
				HttpSession session = request.getSession();
				session.setAttribute("userId", user);
				
				response.sendRedirect("cooperList.jsp");
			}
		}else{
			response.sendRedirect("HUBMain.jsp");
		}
		
	}

}











