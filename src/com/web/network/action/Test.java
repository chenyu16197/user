package com.web.network.action;

import java.util.List;

import com.web.network.pojo.Demo;
import com.web.network.service.DemoService;
import com.web.network.service.impl.DemoServiceImpl;


public class Test {
	public static void main(String[] args) {
		DemoService userService = new DemoServiceImpl();
		List<Demo> list = userService.getList();
		for(Demo d : list){
			System.out.println(d.getName());
		}
	}
}
