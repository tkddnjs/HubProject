package controller.cooper;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Cooper;
import service.logic.CooperServiceLogic;
import service.pacade.CooperService;

@WebServlet("/registerCooper.do")
public class RegisterCooperController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CooperService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new CooperServiceLogic();
		Cooper cooper = new Cooper();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
		List<String> connChains = new ArrayList<>(); 
		try {
			String coName = request.getParameter("cooperName");
			Date lastDay = new Date(dateFormat.parse(request.getParameter("lastDay")).getTime());
			String ConnChain = request.getParameter("cooperConnChain");
			String coBanner = request.getParameter("asdf");
			
			cooper.setCoName(coName);
			cooper.setLastDay(lastDay);
			connChains.add(ConnChain);
			cooper.setConnChains(connChains);
			cooper.setCoBanner(coBanner);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		service.registerCooper(cooper);
	}

}
