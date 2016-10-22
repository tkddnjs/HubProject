package controller.bucketlist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Bucketlist;
import service.logic.BucketlistServiceLogic;
import service.pacade.BucketlistService;

@WebServlet("/modifyBucketlist.do")
public class ModifyBucketlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BucketlistService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service = new BucketlistServiceLogic();
		
		int bucketlistId = Integer.parseInt(req.getParameter("bucketlistId"));
		
		Bucketlist bucketlist = service.findBucketlistByBucketlistId(bucketlistId);
		req.setAttribute("bucketlistId", bucketlistId);
		req.setAttribute("bucketlist", bucketlist);
		req.getRequestDispatcher("modifyBucketlist.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int bucketlistId = Integer.parseInt(request.getParameter("bucketlistId"));
		
		Bucketlist bucketlist = new Bucketlist();
		bucketlist.setBucketlistId(bucketlistId);
		bucketlist.setTitle(request.getParameter("title"));
		bucketlist.setGoal(request.getParameter("goal"));
		bucketlist.setStar(Integer.parseInt(request.getParameter("star")));
		bucketlist.setSos(request.getParameter("sos"));
		bucketlist.setMemo(request.getParameter("memo"));
		List<String> connChains = new ArrayList<>();
		for(String connChain : request.getParameterValues("connchain")){
			connChains.add(connChain);
		}
		bucketlist.setConnChains(connChains);
		bucketlist.setUserId((String)session.getAttribute("userId"));
		
		service.modifyBucketlist(bucketlist);
	}
}
