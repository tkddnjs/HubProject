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
		
		// 	connChains �� ����
		//	listOption ���� ���� �ٸ� �޼ҵ� ȣ��
		//	'����' �� ���

		/*
		 * if('����')
		 *		users = service.findUsers~~~~~~~~~
		 *   	setAttribute(users)
		 *		list��ܿ� '����' ǥ��
		 * 
		 * else if('��ü')
		 * 		coopers = service.findCoopers~~~~~~~~~~~~~~
		 * 		setAttribute(coopers)
		 * 		list��ܿ� '��ü' ǥ��
		 * 
		 * else {
		 * 		bucketlists = service.findBucketlists~~~~~~~~~~~~~~
		 * 		setAttribute(bucketlist)
		 *		if('����')
		 *			list��ܿ� '����' ǥ��
		 * 		else('����')
		 * 			list��ܿ� '����' ǥ��
		 * 
		 * }
		 * */
	}

}
