package controller.list;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.logic.ListServiceLogic;
import service.pacade.ListService;

@WebServlet("/list.do")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ListService service;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service = new ListServiceLogic();
		
		// 	connChains 값 저장
		//	listOption 값에 따라 다른 메소드 호출
		//	'내가' 인 경우

		/*
		 * if('내가')
		 *		users = service.findUsers~~~~~~~~~
		 *   	setAttribute(users)
		 *		list상단에 '내가' 표시
		 * 
		 * else if('업체')
		 * 		coopers = service.findCoopers~~~~~~~~~~~~~~
		 * 		setAttribute(coopers)
		 * 		list상단에 '업체' 표시
		 * 
		 * else {
		 * 		bucketlists = service.findBucketlists~~~~~~~~~~~~~~
		 * 		setAttribute(bucketlist)
		 *		if('나를')
		 *			list상단에 '나를' 표시
		 * 		else('서로')
		 * 			list상단에 '서로' 표시
		 * 
		 * }
		 * */
	}

}
