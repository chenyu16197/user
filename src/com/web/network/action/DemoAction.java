package com.web.network.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.network.action.base.BaseAction;
import com.web.network.pojo.Demo;
import com.web.network.service.DemoService;
import com.web.network.service.impl.DemoServiceImpl;

public class DemoAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private DemoService userService;
	
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    
		DemoService userService = new DemoServiceImpl();
		List<Demo> list = userService.getList();
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/view/index.jsp").forward(request, response);
	}
	
	

}
