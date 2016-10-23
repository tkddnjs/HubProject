package controller.friends;

import java.io.IOException;
import java.util.List;

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
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service = new FriendServiceLogic();
		
		HttpSession session = request.getSession();
		
		String userId = (String) session.getAttribute("userId");
		
		request.setAttribute("friends", service.findAll(userId));
		request.getRequestDispatcher("Friend/listFriend.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new FriendServiceLogic();
		
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		
		List<Friend> friends = null;
		int searchOpt = Integer.parseInt(request.getParameter("searchOpt"));
		
		switch(searchOpt){
			case 1:
				String connChain = request.getParameter("searchWord");
				friends = service.findFriendsByConnChain(userId, connChain);
				break;
			case 2: 
				int relation = Integer.parseInt(request.getParameter("searchWord"));
				Friend friend = new Friend();
				friend.setUserId(userId);
				friend.setRelation(relation);
				friends = service.findFriendsByRelation(friend);
				break;
			
		}
		
		request.setAttribute("friends", friends);
		request.getRequestDispatcher("Friend/listFriend.jsp").forward(request, response);
	}
}
