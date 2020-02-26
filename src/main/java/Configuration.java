
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
	{	Properties prop = new Properties();
	String filename = "C:\\Users\\Quence\\eclipse-workspace\\Lavoro_DB\\src\\main\\resources\\configuration.cfg";


	try {
		InputStream is = new FileInputStream(filename);
		prop.load(is);

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	url = prop.getProperty("url");
	username =prop.getProperty("user");
	password =prop.getProperty("password");
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	conn = DriverManager.getConnection(url, username, password);

	//	System.out.println("Database Connected");
	// TODO Auto-generated constructor stub

	//	System.out.print(url+ username+ password );

	}
	/*
	 * public void Create_Connection() throws SQLException { conn =
	 * DriverManager.getConnection(url, username, password);
	 * System.out.println("Database Connected"); }
	 */
	/*
	 * public static void main(String [] args) throws IOException, SQLException {
	 * System.out.println("Main"); Configuration c = new Configuration(); }
	 */


}

