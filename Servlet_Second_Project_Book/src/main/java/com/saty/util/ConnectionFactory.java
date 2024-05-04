package com.saty.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
	
	private static DataSource  ds= null;
	
	public static Connection getConnection() throws SQLException, IOException {
		
		// read data from file
		
		FileInputStream fis = new FileInputStream(new File("dbconfig.properties"));
		
		Properties properties = new Properties();
		properties.load(fis);
		
		String uname = properties.getProperty("db.username");
		
		String pass = properties.getProperty("db.password");
		
		String url = properties.getProperty("db.url");
		
		
		// connection pool
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setUsername(uname);
		hikariConfig.setPassword(pass);
		hikariConfig.setJdbcUrl(url);
		
		//
		
		ds = new HikariDataSource(hikariConfig);
		Connection con = ds.getConnection();
		return con;
	}
}
