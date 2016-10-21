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

@WebServlet("/registerBucketlist.do")
public class RegisterBucketlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BucketlistService service;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		service = new BucketlistServiceLogic();
		Bucketlist b = new Bucketlist();
		
		
		
		
		
		
		//service.registerBucketlist(b);
		
		
		res.sendRedirect("registerBucketlist.jsp");
	}

}
