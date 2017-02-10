package com.web.network.dao;

import java.util.List;

import com.web.network.pojo.Demo;


public interface DemoDao {

	public List<Demo> getList();

	public Demo getById(Long id);

	public void deleteById(Long id);

	public Long insert(Demo demo);

	public void update(Demo demo);


}
