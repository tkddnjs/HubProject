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

@WebServlet("/registerBucketlist.do")
public class RegisterBucketlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BucketlistService service;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		service = new BucketlistServiceLogic();
		HttpSession session = req.getSession();
		Bucketlist b = new Bucketlist();
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
		System.out.println("1");
		System.out.println(b);
		service.registerBucketlist(b);
		req.getRequestDispatcher("Bucketlist/bucketList.jsp").forward(req, res);

	}

}
