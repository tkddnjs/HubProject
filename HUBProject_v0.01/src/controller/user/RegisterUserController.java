package controller.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.logic.UserServiceLogic;
import service.pacade.UserService;

@WebServlet("/registerUser.do")
public class RegisterUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService service;
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		service = new UserServiceLogic();
		User user = new User();
		user.setUserId(req.getParameter("userid"));
		user.setPw(req.getParameter("pw"));
		user.setEmail(req.getParameter("email"));
		int sum = 0;
		for(String listopt : req.getParameterValues("listoption")){
				sum += Integer.parseInt(listopt);
		}
		user.setListOption(sum);
		System.out.println(req.getParameter("connchain"));
		List<String> connchains = new ArrayList<>();
		connchains.add(req.getParameter("connchain"));
		user.setConnChains(connchains);
		System.out.println(connchains);

		user.setIntroduce(req.getParameter("introduce"));
		System.out.println(user);

		service.registerUser(user);
		

		res.sendRedirect("HUBMain.jsp");
		
	}

}
