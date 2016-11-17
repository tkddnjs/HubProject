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

//@WebServlet("/findBucketlist.do")
public class FindBucketlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BucketlistService service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new BucketlistServiceLogic();
		
		Bucketlist bucketlist = service.findBucketlistByBucketlistId(Integer.parseInt(request.getParameter("bucketlistId")));
		
		request.setAttribute("bucketlist", bucketlist);
		request.getRequestDispatcher("detailBucketlist.jsp").forward(request, response);
	}

}
