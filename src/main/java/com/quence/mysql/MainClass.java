package com.quence.mysql;
import java.io.IOException; 
import java.sql.ResultSet;
import java.sql.ResultSetMetaData; 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MainClass {


	
	public static void main(String [] args) throws IOException, SQLException {
		
		//init config
		Configuration c = new Configuration();
		//opendbconn
		//populatelist
		Query q = new Query(c.getConn());
		//display
		Display_Query d = new Display_Query();
		d.display(q.getDataMappinglist());
		
	}
}

