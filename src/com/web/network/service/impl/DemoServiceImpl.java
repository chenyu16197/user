package com.web.network.service.impl;

import java.util.List;

import com.web.network.dao.DemoDao;
import com.web.network.dao.impl.DemoDaoImpl;
import com.web.network.pojo.Demo;
import com.web.network.service.DemoService;

public class DemoServiceImpl implements DemoService{

	private DemoDao demoDao = new DemoDaoImpl();
	@Override
	public List<Demo> getList() {
		return demoDao.getList();
	}


}
