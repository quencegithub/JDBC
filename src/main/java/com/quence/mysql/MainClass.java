package com.quence.mysql;
import java.io.IOException; 
import java.sql.ResultSet;
import java.sql.ResultSetMetaData; 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MainClass {

	ResultSet rs1; 
	public void Format(ResultSet rs1) throws SQLException {
		ResultSetMetaData rsMetaData = rs1.getMetaData();
		int numberOfColumns = rsMetaData.getColumnCount();
		for(int i = 1; i <= numberOfColumns; i++) {
			System.out.print(rsMetaData.getColumnLabel(i) + "   |   "); }
		System.out.println("\n===================================================");
		
	} 
	public static void main(String [] args) throws IOException, SQLException {
		
		//init config
		//opendbconn
		
		
	}
}
