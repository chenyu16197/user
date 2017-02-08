package com.web.network.dao.base;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * http://blog.csdn.net/softwave/article/details/18604565
 *
 */


public class BaseDao {

	private static Properties prop = new Properties();

	static{
		try {
			InputStream in = BaseDao.class.getClassLoader().getResourceAsStream("database.properties");
			prop.load(in);
		    in.close();
		} catch (Exception e) {
            e.printStackTrace();
		}
	}

	public static Connection getConnection(){
	    Connection connection = null;
	    try {
	        Class.forName(prop.getProperty("database.driver"));
	        connection = DriverManager.getConnection(prop.getProperty("database.url"), prop.getProperty("database.user"), prop.getProperty("database.password"));
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return connection;
	}
}
