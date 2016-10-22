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

@WebServlet("/listFriend.do")
public class ListFriendController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private FriendService service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new FriendServiceLogic();
		
		HttpSession session = request.getSession();
		
		String userId = (String) session.getAttribute("userId");
		String friendId = request.getParameter("friendId");
		String relation = request.getParameter("relation");
		
		Friend friend = new Friend();
		
		friend.setUserId(userId);
		friend.setFriendId(friendId);
		friend.setRelation(relation);
		
		service.findAll(friend);
		
	}

}
