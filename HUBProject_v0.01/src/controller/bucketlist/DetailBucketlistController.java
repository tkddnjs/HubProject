package controller.bucketlist;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Bucketlist;
import service.logic.BucketlistServiceLogic;
import service.pacade.BucketlistService;

//@WebServlet("/bucketlistDetail.do")
public class DetailBucketlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BucketlistService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		service = new BucketlistServiceLogic();
		
		int bucketlistId = Integer.parseInt(request.getParameter("bucketlistId"));
		int listOpt = Integer.parseInt(request.getParameter("listOpt"));
		String connChain = request.getParameter("connChain");
	
		Bucketlist bucketlist = service.findBucketlistByBucketlistId(bucketlistId);
		
		request.setAttribute("bucketlist", bucketlist);
		request.setAttribute("listOpt", listOpt);
		request.setAttribute("connChain", connChain);
		request.getRequestDispatcher("Bucketlist/detailBucketlist.jsp").forward(request, response);
	}

}
