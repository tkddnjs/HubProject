package controller.friends;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.logic.FriendServiceLogic;
import service.pacade.FriendService;

@WebServlet("/registerFriend.do")
public class RegisterFriendController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private FriendService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new FriendServiceLogic();
		
	}

}
