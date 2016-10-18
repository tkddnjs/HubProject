package controller.post;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.logic.PostServiceLogic;
import service.pacade.PostService;

@WebServlet("/deletePost.do")
public class DeletePostController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PostService service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new PostServiceLogic();
		
	}

}
