package controller.cooper;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.logic.CooperServiceLogic;
import service.pacade.CooperService;

@WebServlet("/searchCompany.do")
public class SearchCooperController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CooperService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new CooperServiceLogic();
		
	}

}
