package com.web.network.dao.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.web.network.dao.DemoDao;
import com.web.network.dao.base.BaseDao;
import com.web.network.pojo.Demo;

public class DemoDaoImpl extends BaseDao implements DemoDao{

	@Override
	public List<Demo> getList() {
		String sql = "select * from demo";
		List<Demo> list = new ArrayList<Demo>();
		try {
			list = qr.query(connection, sql, new BeanListHandler<Demo>(Demo.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Demo getById(Long id) {
		String sql = "select * from demo where id=?";
		Demo demo = new Demo();
		try {
			demo = (Demo) qr.query(connection, sql , new BeanHandler<Demo>(Demo.class), id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return demo;
	}

	@Override
	public void deleteById(Long id) {
		String sql = "delete from demo where id=?";
		try {
			qr.update(connection, sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Long insert(Demo demo) {
	    String sql = "insert into demo (name) values (?)";
	    Long lastestId = 0L;
		try {
			int count = qr.update(connection, sql, demo.getName());
	        lastestId = (Long) qr.query(connection, "select last_insert_id()", new ScalarHandler<Long>(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lastestId;
	}

	@Override
	public void update(Demo demo) {
	    String sql = "update demo set name = ? where Id = ?";
	    try {
	    	int count = qr.update(connection, sql, new Object[] { demo.getName(),demo.getId()});
		} catch (Exception e) {
            e.printStackTrace();
		}
	}
}
