package com.web.network.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.network.action.base.BaseAction;
import com.web.network.service.UserService;
import com.web.network.service.impl.UserServiceImpl;
import com.web.network.utils.User;

public class UserAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    
		UserService userService = new UserServiceImpl();
		List<User> list = userService.getList();
		request.getRequestDispatcher("WEB-INF/view/index.jsp").forward(request, response);
	}
	
	

}
