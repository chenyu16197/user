package com.web.network.dao.impl;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.web.network.dao.DemoDao;
import com.web.network.dao.base.BaseDao;
import com.web.network.pojo.Demo;

public class DemoDaoImpl extends BaseDao implements DemoDao{

	@Override
	public List<Demo> getList() {
		Connection conn = getConnection();
		QueryRunner qr = new QueryRunner();
		String sql = "select * from demo";
		List<Demo> list = new ArrayList<Demo>();
		try {
			list = qr.query(conn, sql, new BeanListHandler<Demo>(Demo.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}



}
