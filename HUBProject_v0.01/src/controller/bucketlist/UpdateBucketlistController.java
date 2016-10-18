package controller.bucketlist;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.logic.BucketlistServiceLogic;
import service.pacade.BucketlistService;

@WebServlet("/updateBucketlist.do")
public class UpdateBucketlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BucketlistService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new BucketlistServiceLogic();
	}

}
