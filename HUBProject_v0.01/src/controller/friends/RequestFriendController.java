package controller.friends;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Friend;
import service.logic.FriendServiceLogic;
import service.pacade.FriendService;

@WebServlet("/requestFriend.do")
public class RequestFriendController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private FriendService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new FriendServiceLogic();

		HttpSession session = request.getSession();
		
		String userId = (String) session.getAttribute("userId");
		String friendId = request.getParameter("friendId");
		int relation = Integer.parseInt(request.getParameter("relation"));
		
		Friend friend = new Friend();
		friend.setUserId(userId);
		friend.setFriendId(friendId);
		friend.setRelation(relation);

		service.registerFriend(friend);
		
		request.setAttribute("userId", friendId);
		request.setAttribute("listOpt", relation);
		request.setAttribute("connChain", request.getParameter("connChain"));
		request.getRequestDispatcher("Friend/requestFriend.jsp").forward(request, response);
	}

}
