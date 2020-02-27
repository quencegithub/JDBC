package com.quence.mysql;

import java.io.*;
import java.net.URL;
import java.util.Objects;
import java.util.Properties;
import java.sql.*;

public class Configuration {
	String url;
	String username;
	String password;
	Connection conn;
	public Configuration() throws IOException, SQLException
	{
		Properties prop = new Properties();
		String args[] = null;
		//String filename = "C:\\Users\\Quence\\eclipse-workspace\\Lavoro_DB_1.0\\target\\Lavoro_DB\\configuration.cfg";
		String filename = args[1];
		FileInputStream inputStream = new FileInputStream(args[1]);
		InputStream is = new FileInputStream(filename);
		prop.load(is);
		url = prop.getProperty("url");
		username =prop.getProperty("user");
		password =prop.getProperty("password");
		conn = DriverManager.getConnection(url, username, password);
	//	System.out.println(url+ username+ password);
	}
	public Connection getConn() {
		return conn;
	}
	
	/*
	 * 
	 * public static void main(String [] args) throws IOException, SQLException {
	 * System.out.println("Main"); Configuration c = new Configuration();
	 * 
	 * }
	 */
}

