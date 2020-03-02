package com.quence.mysql;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Query 
{	Connection c;
Statement stmt ;
List<DataMapping> data=new ArrayList<DataMapping>();
public Query(Connection c) throws IOException, SQLException {
	super();
	this.c = c;
	stmt = c.createStatement(); 
}

//
public List<DataMapping>  getDataMappinglist() throws SQLException{
	String sql1 ="select film.Filmname, film.Year, director.Surname, director.Name from film INNER JOIN director ON  director.iddirector=film.idFilm order by director.Surname, director.Name;";

ResultSet rs1 = stmt.executeQuery(sql1);


while(rs1.next()) {	
	DataMapping data1 = new DataMapping();
	data1.setSurname(rs1.getString("Surname"));
	data1.setFilmName(rs1.getString("FilmName"));
	data1.setYear(rs1.getString("Year"));
	data1.setName(rs1.getString("Name"));
	data.add(data1);

} 


return data;



}

}

