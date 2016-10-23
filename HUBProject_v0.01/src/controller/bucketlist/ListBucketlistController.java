package controller.bucketlist;

import java.io.IOException;
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

@WebServlet("/listBucketlist.do")
public class ListBucketlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BucketlistService service;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		service = new BucketlistServiceLogic();
		HttpSession session = req.getSession();
		session.removeAttribute("bucketlist");
		String userId = (String) session.getAttribute("userId");
		List<Bucketlist> blist = service.findAll(userId);
		req.setAttribute("bucketlists", blist);
		req.getRequestDispatcher("/Bucketlist/bucketList.jsp").forward(req, res);
	}
}
