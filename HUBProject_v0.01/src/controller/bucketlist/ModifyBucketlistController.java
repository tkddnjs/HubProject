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

//@WebServlet("/modifyBucketlist.do")
public class ModifyBucketlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BucketlistService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		service = new BucketlistServiceLogic();
		
		int bucketlistId = Integer.parseInt(req.getParameter("id"));
		Bucketlist bucketlist = service.findBucketlistByBucketlistId(bucketlistId);
		req.setAttribute("bucketlistId", bucketlistId);
		req.setAttribute("bucketlist", bucketlist);
		req.getRequestDispatcher("/Bucketlist/modifyBucketlist.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		int bucketlistId = Integer.parseInt(req.getParameter("bucketId"));
		Bucketlist b = new Bucketlist();
		b.setBucketlistId(bucketlistId);
		b.setTitle(req.getParameter("title"));
		b.setGoal(req.getParameter("goal"));
		b.setStar(Integer.parseInt(req.getParameter("star")));
		b.setSos(req.getParameter("sos"));
		b.setMemo(req.getParameter("memo"));
		List<String> connChains = new ArrayList<>();
		for(String connChain : req.getParameterValues("connchain")){
			connChains.add(connChain);
		}
		b.setConnChains(connChains);
		b.setUserId((String)session.getAttribute("userId"));
		service.modifyBucketlist(b);
		res.sendRedirect("listBucketlist.do");

	}
}
