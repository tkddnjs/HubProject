package controller.group;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.logic.GroupServiceLogic;
import service.pacade.GroupService;

@WebServlet("/updateGroup.do")
public class ModifyGroupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private GroupService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new GroupServiceLogic();
		
	}

}